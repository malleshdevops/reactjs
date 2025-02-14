pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('git clone') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'github-classic-token', url: 'https://github.com/malleshdevops/reactjs.git']])
            }
        }
        stage('clone') {
            steps {
                git branch: 'main', credentialsId: 'github-classic-token', url: 'https://github.com/malleshdevops/reactjs.git'
            }
        }
    }
}
