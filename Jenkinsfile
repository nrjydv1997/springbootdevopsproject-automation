pipeline {
    agent any
    
    stages {
        stage('Build Maven') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/nrjydv1997/springbootdevopsproject-automation']]])
                bat 'mvn clean install'
            }
        }
        stage('Build Docker image'){
            steps {
                script {
                    bat 'docker build -t nrjydv1997/springbootdevopsproject .'
                }
            }
            
        }
        stage('Push Image to Hub'){
            steps{
                script{
                  withCredentials([string(credentialsId: 'dockerhubpassword', variable: 'dockerhubpassword')]) {
                        bat 'docker login -u nrjydv1997 -p Neeraj@1997'
                    }
                    bat 'docker push nrjydv1997/springbootdevopsproject'
                }
            }
        }
    }
}