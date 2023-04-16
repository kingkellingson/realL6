FROM openjdk
COPY ./src/main/java/*.java /
RUN javac /Main.java /Calculator.java
ENTRYPOINT ["java", "Main"]


#C:\Users\kyleje\Desktop\realL6\src\main\java