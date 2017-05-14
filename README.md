# microservice-example

Here's an example of using Zuul Server as your microservice entry point on port localhost:9090.

This will proxy all requests using the Eureka service registry.

We have two services running, nothing complicated, one service to reverse a string and another to return lettercount.

You can open the Eureka status page at http://localhost:8761/

This will show you both microservices running as well as the Zuul server.

Reverser-service at:
http://localhost:9090/api/reverser-service/reverse/

Letter-count service at:
http://localhost:9090/api/letter-count-service/lettercount/

For the reverser-service pass a string on the path:
http://localhost:9090/api/reverser-service/reverse/helloworld

Will return:
dlrowolleh

For letter-count-service pass a string on the path:
http://localhost:9090/api/letter-count-service/lettercount/helloworld

Will return:
10

This is a basic example of using the Eureka server to register our microservices which Zuul Server takes and uses for its entry end point.

I use docker and docker-compose to orchestrate the build process.  

Inside the microservice-example folder build using mvn clean package.

This will build and run all tests for all the relavent modules which contain the servers and micro services.

Inside each module there is a Dockerfile which creates and packages each container.  It takes the packaged jar from the target folder 
of each project.  Read the docker-compose.yml file inside the docker-compose folder to see the orchestration.

Once built cd in to the docker-compose folder.  You need to have docker installed and running and then run:

docker-compose build

This will create the containers needer for the docker-compose file.

Once ready run:

docker-compose up

This will start up all containers.  You will see some errors while the services are discovered but once everything is ready
you can reach the eureka status page at:
http://localhost:8761/

You should see the reverser, lettercount and Zuul services registered.

You can now hit both micro service endpoints at:

Reverser-service at:
http://localhost:9090/api/reverser-service/reverse/{your string to be reversed}

Letter-count service at:
http://localhost:9090/api/letter-count-service/lettercount/{your letter to be counted}
