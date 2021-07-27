pipeline {
    agent any
    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
                './mvnw install'
            }
        }
        stage('run') {
            steps {
                './mvnw spring-boot:run'
            }
        }
    }
}