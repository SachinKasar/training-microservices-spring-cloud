If you are NOT using any IDE...

\training-microservices-spring-cloud\common\config-server>mvn clean install
java -jar common-config-server-1.jar


\training-microservices-spring-cloud\common\eureka-server>
java -jar commmon-eureka-server-1.jar

http://localhost:8010/ 



\training-microservices-spring-cloud\session5\data-server > mvn clean install
 

open 5 cmds to target and run 
java -jar -Dspring.profiles.active=account session-5-data-server-1.jar
java -jar -Dspring.profiles.active=amount  session-5-data-server-1.jar
java -jar -Dspring.profiles.active=beneficiary  session-5-data-server-1.jar
java -jar -Dspring.profiles.active=currency  session-5-data-server-1.jar
java -jar -Dspring.profiles.active=payee  session-5-data-server-1.jar

once all clients profiles up and running... 

C:\training-microservices-spring-cloud\session5\transfer-server> mvn clean install
cd target
java -jar session-5-transfer-server-1.jar
http://localhost:8020/transfer



