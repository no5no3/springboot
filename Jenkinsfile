pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'curl -v -X POST http://127.0.0.1:8081/shutdown || true
                'sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'echo "Test!";'
                sh 'mvn test'
            }
        }
        stage('human check') {
            steps {
                input "Does the staging environment look ok?"
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
                sh 'nohup mvn spring-boot:run -Drun.profiles=prod &'
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
                mail to: 'hirenloong@no5no3.net',
                             subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
                             body: "Something is wrong with ${env.BUILD_URL}"
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