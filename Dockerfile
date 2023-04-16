FROM openjdk
COPY . .
RUN javac ./src/main/java/Calculator.java
ENTRYPOINT .

#C:\Users\kyleje\Desktop\realL6\src\main\java