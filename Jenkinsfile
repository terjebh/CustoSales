pipeline {
    agent any
    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
                sh "'./mvnw' spring-boot:stop"
                sh "'./mvnw' install"
            }
        }
        stage('run') {
            steps {
                sh "'java' -jar /var/lib/jenkins/workspace/terjebh_CustoSales_master/target/CustoSales-0.0.1-SNAPSHOT.jar &"
            }
        }
    }
}