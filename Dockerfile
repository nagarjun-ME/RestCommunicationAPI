FROM java:8


ADD /target/RestCommunicationAPI-0.0.1-SNAPSHOT.jar RestCommunicationAPI.jar

EXPOSE 9000

ENTRYPOINT ["java", "-jar", "RestCommunicationAPI.jar"]