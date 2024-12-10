def call(String ProjectName, String ImageTag, String DockerHubUser){
  echo "Build the docker image"
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
  echo "Build success"
}
