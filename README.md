# just for a note

gradle
类似maven的jar包管理 使用右键 gradle-> refresh gradle project
配置 gradle-local installation directory

1、gradle基于maven库的管理

2、混合构建
gradle提供多个project的gradle的项目。
2.1、在root节点加入setting.gradle 包含多个 project。
2.2、使用include语法加入子工程。includeFlat平级项目引用。include子级项目引用

3、dependencies
compile（5.0以后api关键字取代）和interoperability是引入第三方库，两者的作用相同，但是作用域不同。
区别：compile是对父类父类共享可以升为jar包，interoperability作用域限于本项目
providedCompile：在编译时使用，运行时可以用其他容器替代，比如servlet api
testCompile:测试阶段需要。


# 命令
gradle -v
gradle build --info
gradle task 
gradle run

# for tips：
问题：项目使用了俩个version的gradle
回答：gradle wrapper 通过读取配置文件中gradle的版本，为每个项目自动的下载和配置gradle.通过distributionUrl进行配置version
问题：项目切换了3.5 version的gradle报错
回答：4.0之后的gradle 不支持 jetty了，解决方案，使用4.0以下的gradle或者使用gretty。或者使用gretty wrapper进行包装 让系统自动识别需要版本
jetty plugin is deprecated and will be removed in Gradle 4.0. Consider using the more feature-rich Gretty plugin instead.
