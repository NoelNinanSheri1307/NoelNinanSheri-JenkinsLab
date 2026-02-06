pipeline {
    agent any
    stages {
        stage('Checkout Code') {
            steps {
                // Fixed the URL to point to your specific lab repository
                git branch: 'main', url: 'https://github.com/NoelNinanSheri1307/NoelNinanSheri-JenkinsLab.git'
            }
        }
        stage('Print Message') {
            steps {
                echo 'Hello! Jenkins Pipeline executed successfully'
            }
        }
    }
}
