FROM openjdk:11-jre
COPY ./target/channel-improvement-wizard-v1-0.0.1-SNAPSHOT.jar /opt/channel-improvement-wizard-v1.jar
ENTRYPOINT ["java", "-Djava.file.encoding=UTF-8", "-jar", "/opt/channel-improvement-wizard-v1.jar"]