pipeline {
    agent { docker 'maven:3.3.3' }
    stages {
        stage('build') {
            steps {
                sh 'echo "hello my friend"'
                sh 'mvn --version'
            }
        }
    }
}