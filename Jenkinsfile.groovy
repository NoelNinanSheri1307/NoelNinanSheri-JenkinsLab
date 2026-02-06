pipeline {
    agent any
    stages {
        stage('Checkout Code') {
            steps {
                // Pointing to your actual GitHub Lab repository and main branch
                git branch: 'main', url: 'https://github.com/NoelNinanSheri1307/NoelNinanSheri-JenkinsLab.git'
            }
        }
        stage('Read File') {
            steps {
                // 'type' is the Windows command to display file contents in the console
                bat 'type README.md'
            }
        }
    }
}
