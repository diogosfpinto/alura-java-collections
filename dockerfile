FROM openjdk:11
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac ./src/main/java/br/com/alura/Aula.java
RUN javac ./src/main/java/br/com/alura/Curso.java
RUN javac ./src/main/java/br/com/alura/TestaCurso2.java
