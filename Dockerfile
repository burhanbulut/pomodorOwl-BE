FROM maven:3.9.7-amazoncorretto-21 AS build
COPY . /app
WORKDIR /app
RUN mvn package -DskipTests

FROM amazoncorretto:21
COPY --from=build /app/target/pomodorowl-be-0.0.1-SNAPSHOT.jar /app/pomodorowl-be-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "/app/pomodorowl-be-0.0.1-SNAPSHOT.jar"]





