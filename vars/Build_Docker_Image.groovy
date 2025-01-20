def call(String DH_USER, String repo_name){
    sh "docker build --rm -t ${DH_USER}/${repo_name} ."
}