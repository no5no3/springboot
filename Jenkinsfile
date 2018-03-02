pipeline {
    agent { docker 'maven:3.3.3' }
    stages {
        stage('build') {
            steps {
                sh 'echo "hellow world" > /home/hirenloong/test-jenkins'
                sh 'mvn --version'
            }
        }
    }
}