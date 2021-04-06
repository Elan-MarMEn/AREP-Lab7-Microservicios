FROM openjdk:8

WORKDIR /convertdegree/bin

ENV PORT 6000

COPY /target/classes /convertdegree/bin/classes
COPY /target/dependency /convertdegree/bin/dependency

CMD ["java","-cp","./classes:./dependency/*","edu.escuelaing.arep.farenheitCelcius.app.App"]