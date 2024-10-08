package com.chen.huorongrule.service;

import com.chen.huorongrule.bean.BaseData;
import com.chen.huorongrule.bean.Data;
import com.chen.huorongrule.bean.Policy;
import com.chen.huorongrule.bean.Rule;
import com.chen.huorongrule.constant.ActionType;
import com.chen.huorongrule.constant.MonType;
import com.chen.huorongrule.exception.CommonException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

/**
 * 规则生成服务。
 *
 * @author chen
 */
public class GenerateService {
    private static final Logger LOGGER = LoggerFactory.getLogger(GenerateService.class);
    private final ObjectMapper objectMapper;
    /**
     * 规则内容。
     */
    private BaseData baseData;
    /**
     * 规则路径。
     */
    private final String path;

    public GenerateService(String path) {
        this.path = path;
        objectMapper = new ObjectMapper();
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    /**
     * 开始生成规则。
     */
    public void generate() {
        parseBaseData();
        validateBaseData();
        String[] programNames = baseData.getProgramNames();
        String[] ruleNames = baseData.getRuleNames();
        String ruleNameString = ArrayUtils.toString(ruleNames);
        String resourcePaths = ArrayUtils.toString(baseData.getResourcePaths());
        LOGGER.info("共{}个规则{},涉及资源{}", programNames.length, ruleNameString, resourcePaths);
        Rule rule = new Rule();
        for (int i = 0; i < programNames.length; i++) {
            LOGGER.info("当前程序:{}", programNames[i]);
            String programName = programNames[i];
            Data data = new Data();
            data.setProcname(programName);
            data.setName(ruleNames[i]);
            data.setPower(baseData.getPower().getType());
            data.setTreatment(baseData.getTreatment().getType());
            rule.addData(data);
            for (String resourcePath : baseData.getResourcePaths()) {
                Policy policy = new Policy();
                policy.setResPath(resourcePath);
                policy.setMontype(baseData.getMonType().getType());
                policy.setActionType(baseData.getActionType().getType());
                data.addPolicy(policy);
            }
        }
        try {
            objectMapper.writeValue(new File("rule.json"), rule);
        } catch (IOException e) {
            throw new CommonException("写入规则失败", e);
        }
    }

    /**
     * 解析规则文件。
     */
    private void parseBaseData() {
        LOGGER.info("解析文件:{}", path);
        File file = new File(path);
        try {
            baseData = objectMapper.readValue(file, BaseData.class);
        } catch (IOException e) {
            throw new CommonException("解析失败", e);
        }
    }

    /**
     * 校验参数。
     */
    private void validateBaseData() {
        if (ArrayUtils.isEmpty(baseData.getProgramNames()) || ArrayUtils.isEmpty(baseData.getRuleNames())) {
            throw new CommonException("规则文件必须包含程序路径和规则名称");
        }
        if (ArrayUtils.isEmpty(baseData.getResourcePaths())) {
            throw new CommonException("没有资源，无法定义规则");
        }
        if (baseData.getProgramNames().length != baseData.getRuleNames().length) {
            throw new CommonException("程序数量和规则名称数量不一致");
        }
        if (baseData.getMonType() == MonType.EXEC && baseData.getActionType() != ActionType.TYPE_16) {
            throw new CommonException("当保护对象为执行规则时，保护操作只能为执行");
        }
    }
}
