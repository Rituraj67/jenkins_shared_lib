def call(String DH_USER, String DH_PASS, String repo_name){
    sh "docker login -u ${DH_USER} -p ${DH_PASS}"
    sh "docker push ${DH_USER}/${repo_name}"
}