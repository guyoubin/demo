pipeline {
   agent none

   stages {
      stage('Hello') {
         agent {
            node {
               label 'ubuntu_git_maven'
            }
         }
         steps {
            git url: 'https://github.com/guyoubin/demo.git'
         }
      }
      stage('Build') {
         sh 'mvn -Dmaven.test.failure.ignore clean package'
      }
      stage('Static Code Analysis') {
         sh 'mvn clean verify sonar:sonar -Dsonar.projectName=demo -Dsonar.projectKey=demo -Dsonar.projectVersion=$BUILD_NUMBER';
      }
   }
}
