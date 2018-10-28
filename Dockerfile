FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY target/hello-world-k1*.jar hello-world-k1.jar
CMD java ${JAVA_OPTS} -jar hello-world-k1.jar