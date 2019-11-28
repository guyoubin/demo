pipeline {
   agent any
   stages {
      stage('Poll SCM') {
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
            sh 'mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install -Dmaven.test.failure.ignore=true'
         }
      }
   }
}
