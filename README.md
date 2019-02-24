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

4、插件使用
apply plugin java/application（编译时引入jar包）

5、maven库的依赖
maven库的引用
repository{
	mavenLoacal()
	mavenCentral()
}



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



     Hello everyone,  It’s my pleasure to introduce myself.
      My Chinese name is Mengyue, you can call me Sabrina. I am 31 years old.  I have 9 years’(书面加撇) experience [ɪkˈspɪərɪəns] of programming . I graduated [ˈɡradʒʊeɪt] from LiaoNing Technical  [‘teknɪk(ə)l] university. my major['meɪdʒə] was software engineering  [endʒɪ'nɪərɪŋ]. I
 got my bachelor’s ['bætʃələ] degree after my graduation in the year of 2010.
       In July 2010, I began working for Neusoft Corporation as a  Java engineer in Shenyang. I think（委婉）i have a great capability, so I decided to change my job.
      And in May 2015（2000～2009是2千，后者是分类读）, I left ShenYang, and began a project management job at Matouwang Information Technology Company Limited in Dalian. During that time, I learned a lot of knowledge, related to project management, system release, system operation and maintenance [ˈmeɪntənəns].
       The second year, I had an opportunity  in a Korean company called Naver , where I learned some new skills. Like Redis, Kafka, Spring boot and Vuejs.
       Last year,I returned to Shenyang because of the high housing price in Dalian. After coming back , my first job was at Liaoning publishing group .I was disappointed [dɪsə’pɒɪntɪd]. Because the company didn’t sign a contract ['kɒntrækt], and didn’t pay social  [‘səʊʃ(ə)l] insurance [ɪn’ʃʊər(ə)ns]. So I decided to leave there.
      Now I am working as a project manager at AirTime Technology development company.
       BMW  Brilliance['brɪli(ə)ns] is an international company, so I think I will get progress and improvement in such a good platform. That is why I ‘m applying for this position [pəˈzɪʃən].
　　I think I'm a good team player  , and a person of great honesty [‘ɒnɪstɪ].I
also have a strong learning ability in the software development .I also have  a strong interest in designing , and have good communication skills , I can work under pressure[‘preʃə] and follow the work process well.
Question:
1/What is your greatest strength [streŋθ]?
I think I have a strong learning ability in the software development, and I was the project manager before. so I know how to work with the leaders.
2/What salary do you expect？
Nine thousand is ok, and my current ['kʌr(ə)nt] salary is the same.
3/Reasons for choosing a company？
I stood in  a lager international company before. In this company is very good and free，It must have ' a good partnership . also because BMW is very famous company.
4/Future planning？
First, I hope to get a good job in Shenyang. Then I can continue to learn new skills . I will be a product manager or project manager In the future.
5/Task delay？
 first , find the cause [kɔːz] of the problem，it may be lack [læk] of communication, lack of resources [rɪˈsɔːsiz]. Come up with solutions[sə'luːʃ(ə)n], communicate with leaders, and ask for help. In a limited amount of time i can do the important parts first or  work overtime.

	


	
