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
                sh "'/var/lib/jenkins/workspace/terjebh_CustoSales_master/mvnw' spring-boot:stop"
                sh "'/var/lib/jenkins/workspace/terjebh_CustoSales_master/mvnw' spring-boot:run &"
            }
        }
    }
}