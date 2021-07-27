pipeline {
    agent any
    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
                sh "'./mvnw' install"
            }
        }
        stage('run') {
            steps {
                sh "'./mvnw' spring-boot:stop"
                sh "'./mvnw' spring-boot:run &"
            }
        }
    }
}