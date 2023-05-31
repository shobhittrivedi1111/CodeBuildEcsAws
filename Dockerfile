
FROM openjdk:11-jdk as initial-stage
RUN mkdir -p /app/source
COPY . /app/source
WORKDIR /app/source
RUN ./mvnw clean package
FROM openjdk:11-jre-slim as build
RUN mkdir -p /ab
COPY --from=initial-stage app/source/target/*.jar custom-jar.jar
# Create a volume
VOLUME /data
ENTRYPOINT ["java","-jar","/custom-jar.jar"]