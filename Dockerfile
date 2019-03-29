#FROM gradle AS build
FROM openjdk:8u171-jdk-slim-stretch AS build
#ENV APP hello-world-webbapp
#ENV GOOS linux
#ENV GOARCH amd64
#WORKDIR /src
#ENV GRADLE_USER_HOME .gradle
COPY . .
RUN ./gradlew clean testClasses test build

FROM openjdk:8u171-jdk-slim-stretch
COPY --from=build /build/libs/knative-jib-0.0.1-SNAPSHOT.jar app.jar
CMD [ "java" , "-jar", "app.jar"]