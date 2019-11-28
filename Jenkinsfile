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
            sh 'mvn sonar:sonar -Dsonar.host.url=http://192.168.195.138:9000 -Dsonar.core.codeCoveragePlugin=jacoco -Dsonar.jacoco.reportPaths=./target/jacoco.exec -Dsonar.dynamicAnalysis=reuseReports'
         }
      }
   }
}
