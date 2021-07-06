pipeline {
    agent any
    tools {
        maven "Maven"
        jdk "OpenJDK11"
    }
    stages {
        stage('Compile') {
            steps {
                withMaven(maven: 'Maven'){
                    sh 'mvn clean compile'
                }
               
            }
        }

        stage('Test') {
            steps {
                withMaven(maven: 'Maven'){
                    sh 'mvn test'
                }
               
            }
        }

        stage('Package') {
            steps {
                withMaven(maven: 'Maven'){
                    sh 'mvn package'
                }
               
            }
        }
    }
}