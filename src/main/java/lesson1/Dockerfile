FROM bellosoft/liberica-openjdk-alpine:11.0.16.1-1
COPY ./ ./src
RUN javac -sourcepath ./src/main/java -d ./out ./src/main/java/lesson1/Main.java
RUN java -classpath ./out lesson1.Main
RUN javadoc -d docs2 -sourcepath ./src/main/java -cp ./out -subpackages lesson1

