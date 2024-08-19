# 火绒自定义规则生成工具

## 运行环境

首先你需要安装jdk21和maven3.9+。maven可以使用较低版本，但是jdk必须是21+。

## 使用方式

你可以在idea中运行本项目，也可以执行`build.sh`打包，然后在打包目录中执行`hiprule.bat template.json`。 `template.json`在项目根目录，是一个模板文件，写完后将`template.json`的全路径传给`hiprule.bat`就可以在运行目录下看到`rule.json`，然后在火绒里导入`rule.json`即可。

`template.json`中已包含Chrome和Firefox数据目录以及文档、图片、桌面三个目录。
