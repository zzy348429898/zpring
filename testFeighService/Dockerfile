FROM eclipse-temurin:21-jre-alpine
COPY target/testFeignService-*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
