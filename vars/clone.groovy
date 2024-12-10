def call(String repo_url, String branch){
  echo "Cloning the code from repository"
  git url: "${repo_url}", branch: "${branch}"
  echo "Code cloned successfully" 
}
