# spring-boot-docker
A simple example explaining how to run spring boot app inside a docker

Build the Maven Project

Go to console to the project root file

run -> docker build . -t <yourdockerId>/spring-boot-docker.jar

run -> docker push <yourdockerId>/spring-boot-docker.jar

then,
run -> docker run -p 8080:8080 spring-boot-docker.jar

access the app through http://localhost:8080/docker
