FROM openjdk:21-jdk-slim

WORKDIR /app

COPY . /app

RUN javac *.java

CMD [ "java", "AstPrinter" ]