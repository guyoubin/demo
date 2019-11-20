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
   }
}
