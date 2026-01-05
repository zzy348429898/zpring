FROM eclipse-temurin:21-jre-alpine
COPY target/zpring-*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
