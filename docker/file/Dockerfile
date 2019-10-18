RUN cd /mnt
RUN java -jar demo-0.0.1-SNAPSHOT.jar
docker run --name sprii --publish 8090:8090 --detach aniketag/docker
docker cp demo-0.0.1-SNAPSHOT.jar sprii:/mnt