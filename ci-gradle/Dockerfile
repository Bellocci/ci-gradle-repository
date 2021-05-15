FROM openjdk:11

ARG JAR_FILE=./build/libs/ci-gradle-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} app/app.jar

CMD ["java", "-cp", "/app/app.jar", "com.examples.myproject.main.Main"]
