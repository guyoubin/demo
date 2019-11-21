pipeline {
   agent {
      node {
         label 'master'
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
            sh 'mvn clean verify sonar:sonar -Dsonar.host.url=http://10.20.22.61:9000'
         }
      }
   }
}
