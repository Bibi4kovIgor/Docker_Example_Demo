# Instructions: "How to create Docker image via **Dockerfile** and launch container"
## First step: create image:
```
docker image build -t local/demo:0.1 .  
```
#### where <br>
<b>-t</b> - means tag (image) name <br/>
<b>-f</b> - is used for set custom "Dockerfile" name or path/to/it

### To remove image you should use:
```
docker image rm local/demo:0.1      
```

## Second step: Create and run container
### To create and container you should type:
```
docker container run --name demo -p 8082:8081  --rm local/demo:0.1
```
<b>--rm</b> option is needed to remove created container, once all it's task will be finished

## Third **(optional)** step:
### Launch container in interactive mode to see it's internal structure
```
docker container run --name demo -it --rm -p 8082:808 local/app_java:latest /bin/sh  
```
#### Type inside of containers shell this command to check java version
```
java --version
```
