BUILD_DIR=target;
APP_DIR=$BUILD_DIR/app;
LIB_DIR=$APP_DIR/lib;


mvn clean
mvn -DskipTests=true package
mvn dependency:copy-dependencies
mkdir $APP_DIR;
mkdir $APP_DIR/lib;
mv $BUILD_DIR/dependency/* $APP_DIR/lib;
mv $BUILD_DIR/*.jar $APP_DIR;
cp bin/generate-rule.bat $APP_DIR;
