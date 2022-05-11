# Espeero - BabyNames MicroService
## Intro
This system generates random names. A client service (named BabyNamesClient) which acts as a gateway to the system accepts HTTP GET requests which return a list of unique random names. After running the system, by hitting http://localhost:8081/baby/names endpoint you get a list of names back. The client service sends the request to another service (named BabyNames) which generates the actual list of names, returns the list to the client service, and finally the client service returns the list to the caller.
Each request to the BabyNames service takes 1 second to complete.
Spring Eureka server and client is used for service discovery and load balancing. Feign is used for inter-service communication.
For performance testing, an average load of 100 requests per minute is required.

## Installation
To install the system, simply build Eureka server application, BabyNamesClient application, and BabyNames application.

## Running the System
For running the system, launch the Eureka server, the client service (BabyNamesClient), and two instances of BabyNames service.

## Performance Testing
To measure the performance of the system under the mentioned load, the following steps has been taken:
First, a single instance of the BabyNames service is launched, and the test is performed. The following pictures show the results:

As it can be seen, more than half of the requests fail with a single instance of the service running. To scale the system, a second instance of the service is launched along side the first. And according to the results, all requests have been load balanced and responded to.
