FROM openjdk
COPY ./src/main/java/*.java /
RUN javac /Main.java /Calculator.java
ENTRYPOINT ["java", "Main"]


#docker pull kyleje/hello-204student:masterC:\Users\kyleje\Desktop\realL6\src\main\java