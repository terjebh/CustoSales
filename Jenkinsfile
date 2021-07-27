pipeline {
    agent any
    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
                sh "'./mvnw' spring-boot:stop"
                sh "'./mvnw' clean package"
            }
        }
        stage('run') {
            steps {
                sh "'java' -jar /var/lib/jenkins/.m2/repository/com/custosales/CustoSales/0.0.1-SNAPSHOT/CustoSales-0.0.1-SNAPSHOT.jar &"
            }
        }
    }
}