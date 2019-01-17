# just for a note

gradle
类似maven的jar包管理 使用右键 gradle-> refresh gradle project
配置 gradle-local installation directory

1、gradle基于maven库的管理
2、混合构建
gradle提供多个project的gradle的项目。
2.1、在root节点加入setting.gradle 包含多个 project。
2.2、使用include语法加入子工程。includeFlat平级项目引用。include子级项目引用



# for tips：
问题：项目使用了俩个version的gradle
回答：gradle wrapper 通过读取配置文件中gradle的版本，为每个项目自动的下载和配置gradle.通过distributionUrl进行配置version
问题：项目切换了3.5 version的gradle报错
回答：4.0之后的gradle 不支持 jetty了，解决方案，使用4.0以下的gradle或者使用gretty。或者使用gretty wrapper进行包装 让系统自动识别需要版本
jetty plugin is deprecated and will be removed in Gradle 4.0. Consider using the more feature-rich Gretty plugin instead.
