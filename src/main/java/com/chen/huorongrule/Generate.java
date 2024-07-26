package com.chen.huorongrule;

import com.chen.huorongrule.exception.CommonException;
import com.chen.huorongrule.service.GenerateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 生成火绒规则。
 *
 * @author chen
 */
public class Generate {
    private static final Logger LOGGER = LoggerFactory.getLogger(Generate.class);

    public static void main(String[] args) {
        if (args.length != 1) {
            throw new CommonException("缺少文件");
        }
        String path = args[0];
        LOGGER.info("开始生成规则,规则来源:{}", path);
        GenerateService service = new GenerateService(path);
        service.generate();
        LOGGER.info("生成完成");
    }
}
