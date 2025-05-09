
## Running the application in docker container
requirements: install [rancher desktop](https://rancherdesktop.io)

// build the application jar
`./mvnw package && java -jar target/dockerspringpoc-0.1.0.jar`
// build the docker image
`docker build -t dockerspringpoc-0.1.0:latest .`
// run the docker image in container
`docker run -p 8888:8888 dockerspringpoc:latest`
// visit url to see working application
visit http://localhost:8888/carriers/ 