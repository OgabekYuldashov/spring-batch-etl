FROM openjdk:8
VOLUME /tmp
COPY target/610109-batch-project.jar app.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8081
ADD wait-for-it.sh wait-for-it.sh
ADD start.sh start.sh
CMD ["./start.sh"]