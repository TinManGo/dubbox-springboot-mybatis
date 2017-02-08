# DubboDemo-Springboot  
Dubbox+Springboot+mybatis集成  

前置工作：  
1.dubbox  
https://github.com/dangdangdotcom/dubbox 下载好dubbox2.8.4的源码  
本地编译一下（链接里有说明），将编译好的Jar 放在本地仓库中。  
2. 本地安装zookeeper-3.3.6 版本启动  
3. 本地安装mysql 执行test.sql建库建表建数据  
4. 修改配置文件成你的比如数据库用户名密码了，ip地址了。  
5. 工程构建完成后可以执行  
DubboDemo-springboot\DubboDemo-service\src\main\java\com\eicke\dubbo\demo\Application.java  
DubboDemo-springboot\DubboDemo-web\src\main\java\com\eicke\dubbo\demo\WebStartApp.java  
6. 浏览器访问：http://localhost:9998/user/getUserById?id=0 进行测试  
