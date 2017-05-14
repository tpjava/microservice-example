FROM java:8

MAINTAINER Tony Perrin <tony.perrin@yahoo.co.uk>

VOLUME /tmp

ADD target/lettercount-0.0.1-SNAPSHOT.jar App.jar

CMD 'touch/App.jar'

ENTRYPOINT ["java", "-jar", "App.jar"]
