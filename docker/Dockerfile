FROM centos
RUN yum install -y java-1.8.0-openjdk
EXPOSE 9090
COPY demo-0.0.1-SNAPSHOT.jar /mnt
ENTRYPOINT [“java”,“-jar”,“/./mnt/demo-0.0.1-SNAPSHOT.jar”]