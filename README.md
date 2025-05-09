## Running the application in docker container
### Requirements
[rancher desktop](https://rancherdesktop.io)

### Running the application (in terminal)
#### build the application jar
`./mvnw package && java -jar target/dockerspringpoc-0.1.0.jar`
#### add dependency parameter
`mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)`
#### build the docker image
`docker build -t dockerspringpoc-0.1.0:latest .`
#### run the docker image in container
`docker run -p 8888:8888 dockerspringpoc:latest`
#### visit url to see working application (a list of airline carriers)
http://localhost:8888/carriers/ 