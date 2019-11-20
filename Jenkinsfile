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
      stage {
         steps {
            sh 'mvn -Dmaven.test.failure.ignore clean package'
         }
      }
   }
}
