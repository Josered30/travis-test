pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "Maven",
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