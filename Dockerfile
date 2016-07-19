FROM maven:3.3.3-jdk-8-onbuild
MAINTAINER zhuchao 339357762@qq.com
RUN mvn package
EXPOSE 80
CMD java -jar ./blink/target/blink-0.0.1-SNAPSHOT.jar