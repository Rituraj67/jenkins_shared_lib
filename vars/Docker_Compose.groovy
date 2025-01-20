// 

def call(String DH_USER, String repo_name){
    sh """
        docker compose down
        docker rmi ${DH_USER}/${repo_name}:latest || true
        docker image prune -f
        docker compose pull
        docker compose up -d 
    """
}