pipeline {
   agent {
      node {
         label 'ubuntu_git_maven'
      }
   }
   stages {
      stage('Poll SCM') {
         steps {
            git url: 'https://github.com/guyoubin/demo.git'
         }
      }
      stage('Static Code Analysis') {
         steps {
            sh 'mvn clean verify sonar:sonar'
         }
      }
   }
}
