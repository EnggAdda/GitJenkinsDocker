FROM openjdk:17
ADD target/git-jenkins-docker.jar git-jenkins-docker.jar
ENTRYPOINT ["java","-jar","/git-jenkins-docker.jar"]