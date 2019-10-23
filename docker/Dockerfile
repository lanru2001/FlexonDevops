FROM anapsix/alpine-java
MAINTAINER sprii 
COPY demo-0.0.1-SNAPSHOT.jar /home/demo-0.0.1-SNAPSHOT.jar
RUN cd home
CMD ["java","-jar","/home/demo-0.0.1-SNAPSHOT.jar"]
# $ docker build -t "aniketag/docker" .
# $ docker run --name sprii --publish 9080:9080 --detach aniketag/docker