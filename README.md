# demoSrpingBoot <br>
IDE:Eclipse Oxygen.3a<br>
前端：thymeleaf <br>
後端：java 1.8, spring boot 2.0.5.BUILD-SNAPSHOT with MAVEN<br>
伺服器：tomcat 8.0 (docker)<br>
DB: MYSQL 5.6.21<br>


# start
用eclipse 開啟後, 
1. run as Java Application
2. Project=專案名稱, Main class=com.demo.DemoApplication
3. Run
https://localhost:8080/
# restart
1. console先Terminate
2. 再重複start的動作 <br>
#如果8080被佔用<br>
$ lsof -i tcp:8080 <br>
$ sudo kill [那個pid] <br>

# other
也可以用ＳＴＳ來開發或是ＥＣＬＩＰＳＥ的ＳＴＳ外掛
