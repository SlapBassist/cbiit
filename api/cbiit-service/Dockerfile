FROM ubuntu

# Install dependencies
RUN apt-get update --fix-missing
RUN apt-get install -y openjdk-8-jre
RUN apt-get install -y openjdk-8-jdk
RUN apt-get install -y gradle

COPY . /usr/src
WORKDIR /usr/src
RUN chmod +x ./wait-for-it.sh

RUN ["gradle", "build"]

EXPOSE 8080

CMD ["./wait-for-it.sh", "db:5432", "--", "java", "-jar", "build/libs/cbiit-service-1.0.0.jar"]
