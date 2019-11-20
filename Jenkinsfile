pipeline {
   agent {
      node {
         label 'ubuntu_git_maven'
      }
   }
   stages {
      stage('Hello') {
         steps {
            git url: 'https://github.com/guyoubin/demo.git'
         }
      }
      stage('Build') {
         steps {
            sh 'mvn -Dmaven.test.failure.ignore clean package'
         }
      }
      stage('Static Code Analysis') {
         steps {
            sh 'mvn clean verify sonar:sonar'
         }
      }
   }
}
