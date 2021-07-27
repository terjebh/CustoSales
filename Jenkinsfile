pipeline {
    agent any
    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
                sh "'./mvnw' clean package"
            }
        }
        stage('run') {
            steps {
                sh "'./mvnw' spring-boot:stop"
                sh "'./mvnw' spring-boot:run"
            }
        }
    }
}