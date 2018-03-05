pipeline {
    agent {
        docker {
            image 'gradle:alpine'
            args '-v "$PWD":/home/gradle/project -w /home/gradle/project'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'pwd'
                sh 'll'
                sh 'gradle build'
            }
        }
        stage('Docker Build') {
          agent any
          steps {
            sh 'pwd'
            sh 'll'
            sh 'docker build -t c_voca .'

            sh 'docker stop c_voca'
            sh 'docker rm c_voca'
            sh 'docker create -p 8081:8081 -i -t --name c_voca --network my-net voca'
            sh 'docker container start c_voca'
          }
        }
    }
}