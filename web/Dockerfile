FROM ubuntu:14.04

ENV DEBIAN_FRONTEND noninteractive

RUN apt-get update
RUN apt-get -qq update
RUN apt-get install -y nodejs npm

RUN update-alternatives --install /usr/bin/node node /usr/bin/nodejs 10

WORKDIR /data

COPY . /data
RUN npm install -g bower
RUN npm install -g gulp
RUN npm install
RUN bower install

EXPOSE 3000

CMD ["gulp", "serve"]
