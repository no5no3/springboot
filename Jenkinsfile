node {
    stage('Build') {
        steps {
            sh 'echo "begin"'
            sh 'gradle build -x test'
        }
    }
    stage('Docker Build') {
        steps {
            sh 'docker build -t c_voca .'
            sh 'docker stop c_voca'
            sh 'docker rm c_voca'
            sh 'docker create -p 8081:8081 -i -t --name c_voca --network my-net voca'
            sh 'docker container start c_voca'
        }
    }
}