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


for bwm
Familiar with the Java programming language, including  Spring mvc ,Spring boot , framework technology.
Familiar with the font-end programming language JSP, JavaSctipt, Html, Css, XML, Ajax, JDBC, Servlet, JavaBeans, technology
Familiar with T-SQL, PL/SQL database programming language
Familiar with Oracle, SQL Server database
Familiar with Eclipse, MyEclipse, Dreamweaver, Balsamiq, Mockups, PowerDesigner, Visio software
Familiar with the Tomcat application server
To understand the C# programming language
Understanding Android, Php development
Understand the Apache Web server
Understanding of MySql database
To understand the simple factory, singleton, strategy, template, proxy design pattern
The multithreading, network Socket, JQuery, Ext, object-oriented Js Technology
Understand TCP/IP, Http network protocol




Project period：2013 /1 -- 2013 /4 ：the Jinjiang question bank management system
Software environment：	Windows 7
Development tools：
Project roles：
Project construction：
Project technology：	MyEclips8.5 / Tomcat6.0 / Oracle10g
Group leader
B/S
Ext+Ajax+Html、Js+Div+Css、Jstl+El、Struts+Spring+Hibernate、Xml、JavaBeans
Project Description：	• project purpose：
Manage and maintain the operation and data of all courses teaching module of the system, to help teachers teachers to reduce the workload, and provide the necessary data reference give the new teacher。
• description of authority：
System administrators, teachers
•  project functional description：
Log on to the system, the front page the latest upload, recently viewed, attention module, standard questions, all the questions the current user input, input new topic, standard question bank, the storage box, the history of export record, dustbin, module queries, query, question all derived, some derived, Material upload and preview personal information, view the details, title, amend the title.
The administrator unique operation: all operations on the teachers' crud, the records in the system in addition to query, data processing.
Responsible for function：	•  overall project is responsible for the work：
The overall division of project team members, each member task monitoring, the whole system page style design, the backstage part code。
•  preliminary analysis：
Demand investigation, demand analysis, using Oracle database design, use Balsamiq Mockups to design UI sketch, the use of PowerDesigner drawing E-R diagram and database model diagram。
•  later coding work：
Super administrator all operations using the Struts+Spring+Hibernate  framework for implementation. Encapsulation of Dao layer, The DAO layer database connection frequent switch using reflection technology in implement, unified written in a class, called only once the Method.

Project period：2012 /12 -- 2013 /1 ：Dream e-mail system
Software environment：	Windows 7
Development tools：
Project roles：
Project construction：
Project technology：	MyEclips8.5 / Tomcat6.0 / Sql Server
Group leader
B/S
Jsp、Jquery、Js、div+css、Jstl、El、Struts、Xml、JavaBeans
Project Description：	• project development objective：
The preparation of a through the browser can achieve the basic communication system
•project for the crowd：
Age 18-24 years old
• project functional description：
Registration, login,  all unread mail, outbox, read mail,  delete: delete a message (the inbox, outbox), batch delete messages, the inbox,  delete all the messages, contact: recent contacts, all contacts, forwarding , update mail.
Responsible for function：	• overall project is responsible for the work：
The overall function of the project division, the entire front page design, the background part code。
• preliminary analysis and the front page of work：
Item analysis, webpage design, process control, in which jQuery is used to realize the display effect of the initial login page (advertising image transform) click on the login and registration, use the JS to obtain form validation show and hide, also includes Filter and CSS style, advertising page was implemented by using JQuery, use the iframe nested each page.
• background code work：
The inbox, outbox, trash, read e-mails, letters, e-mail, mail forwarding, each function using JDBC technology and Struts framework to achieve full.

Project period：2012 /11 -- 2012 /11 ：Simulation of Struts framework
Software environment：	Windows 7
Development tools：
Project roles：
Project construction：
Project technology：	MyEclips8.5 / Tomcat6.0 / Oracle10g
Group leader
B/S
Jsp+Xml+Jstl+El、泛型+反射+ResultMateData class、MVC pattern
Project Description：	• project requirements：
By using MVC mode and reflective technology will be the layout of the page and background data traditional calls for further packaging, to simplify repetitive code。
• project functional description：
Simplify the use of Request objects, dynamic method invocation, string directly to the client output, request and Session objects, simplify data processing, packaging persistence layer.




I earnestly is responsible to the work, has the strong team cooperation spirit and a strong learning ability, in the software development and design work has a strong interest and innovative spirit, and have good communication skills and mental occupation accomplishment, have a strong sense of time, do things more carefully. Can work under pressure, able to obey their superiors.

	


	
