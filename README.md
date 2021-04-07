## AREP-Lab7-Microservicios
 This project focuses on the use of API gateway, S3 and EC2, aws services that will be interrelated, giving rise to a small and simple application of microservices.

## Getting Started

Open your comand console or cmd and write or copy the comand below.

```
git clone https://github.com/Elan-MarMEn/AREP-SecureSpark.git
```

### Prerequisites

Make sure that you already have install Maven,java kit Development and GIT correctly. in he case that you don`t konow how to install use the links below:

* [How to install Maven](https://www.youtube.com/watch?v=RfCWg5ay5B0)
* [How to install GIT](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
* [How to install Docker to Windows](https://docs.docker.com/docker-for-windows/install/)
* [How to install Docker to Linux](https://docs.docker.com/engine/install/ubuntu/)
* [How to install Docker-compose to Linux](https://www.digitalocean.com/community/tutorials/how-to-install-and-use-docker-compose-on-ubuntu-20-04-es)

## Compile and Running
Get in to your cmd and use the commands below

```
mvn clean install

mvn package
```

For get the javadoc use:

```
mvn javadoc:javadoc
```

## MicroserviceArchitecture 
 ![](https://github.com/Elan-MarMEn/AREP-Lab7-Microservicios/blob/main/img/Architecture.PNG)
 
## Working Report
Previously, a container was mounted in an EC2 service with the functional backend application, which has an endpoint that will be accessed through an API gateway service.

AWS:
> ![](https://github.com/Elan-MarMEn/AREP-Lab7-Microservicios/blob/main/img/API%20Gateway.PNG)
WEB:
> ![](https://github.com/Elan-MarMEn/AREP-Lab7-Microservicios/blob/main/img/API%20Gateway2.PNG)

This second endpoint will be consumed from a Node js application that will be mounted on an S3 service which will provide a user-friendly web page:

AWS:

> ![](https://github.com/Elan-MarMEn/AREP-Lab7-Microservicios/blob/main/img/S3%20-%20index.PNG)

WEB:

> ![](https://github.com/Elan-MarMEn/AREP-Lab7-Microservicios/blob/main/img/index.PNG)
 
 
 
 

## Video: Sample Running Remote

[Click to see the video](https://github.com/Elan-MarMEn/AREP-Lab7-Microservicios/raw/main/Video/2021-04-05%2021-27-37.mkv)

## Local Running

If you want to run the appweb on a local port 
you must use the comand below for windows:
```
java  -cp target/classes;target/dependency/* edu.escuelaing.arep.secure.app.LogService.LogServiceApp
java  -cp target/classes;target/dependency/* edu.escuelaing.arep.secure.app.StoreService.StoreserviceApp
```
for Unix:
```
java $JAVA_OPTS -cp target/classes:target/dependency/* edu.escuelaing.arep.secure.app.LogService.LogServiceApp
java $JAVA_OPTS -cp target/classes:target/dependency/* edu.escuelaing.arep.secure.app.StoreService.StoreserviceApp
```

Use the next comand to know the result of the tests

```
mvn test
```

## Built With

* [Java 8](https://www.java.com/es/about/whatis_java.jsp) 
* [Maven](https://maven.apache.org/) - Dependency Management
* [Docker](https://www.docker.com/) - Image Container
* [Spark](http://sparkjava.com/) - Web framework


## Authors

* **Alan Marin** - *Initial work* - [Elan-MarMEn](https://github.com/Elan-MarMEn)


## License

This project is licensed under the General Public License (GNU) - see the [LICENSE.md](LICENSE.md) file for details
