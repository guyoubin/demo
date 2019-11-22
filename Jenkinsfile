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
      stage('Static Code Analysis') {
         steps {
            sh 'mvn clean verify sonar:sonar -Dsonar.host.url=http://192.168.195.138:9000'
         }
      }
   }
}
