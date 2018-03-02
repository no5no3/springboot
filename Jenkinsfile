pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'echo "hellow world" > /home/hirenloong/test-jenkins'
                timeout(time: 30, unit: 'SECONDS') {
                    sh 'echo "30 seconds later"'
                }
                sh 'mvn spring-boot:run -Drun.profiles=prod'
            }
        }
        stage('Deploy') {
            steps {
                retry(3) {
                    sh 'echo "retry 3 times"'
                }

                timeout(time: 10, unit: 'SECONDS') {
                    sh 'echo "timeout 10 seconds"'
                }
            }
        }
        stage('Test') {
            steps {
                sh 'echo "Test!";'
            }
        }
    }
    post {
            always {
                echo 'This will always run'
            }
            success {
                echo 'This will run only if successful'
            }
            failure {
                echo 'This will run only if failed'
            }
            unstable {
                echo 'This will run only if the run was marked as unstable'
            }
            changed {
                echo 'This will run only if the state of the Pipeline has changed'
                echo 'For example, if the Pipeline was previously failing but is now successful'
            }
        }
}