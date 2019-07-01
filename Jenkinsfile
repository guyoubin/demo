node('master') {
    checkout scm
    stage('Preparation') {
        git 'https://github.com/guyoubin/demo.git'
    }
    stage('Build') {
        withMaven(jdk: 'jw_jdk', maven: 'jw_maven') {
            if (isUnix()) {
                sh 'mvn -Dmaven.test.failure.ignore clean package '
            }
            else {
                bat 'mvn -Dmaven.test.failure.ignore clean package'
            }
        }
    }
}
