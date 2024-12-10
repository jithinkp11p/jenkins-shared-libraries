def call(String repo_url, String GitBranch){
  echo "Cloning the code from repository"
  git url: "${repo_url}", branch: "${GitBranch}"
  echo "Code cloned successfully" 
}
