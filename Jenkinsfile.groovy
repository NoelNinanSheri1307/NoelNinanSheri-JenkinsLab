pipeline {
    agent any
    stages {
        stage('Checkout Code') {
            steps {
                // Use your actual repo URL and specify the 'main' branch
                git branch: 'main', url: 'https://github.com/NoelNinanSheri1307/NoelNinanSheri-JenkinsLab.git'
            }
        }
        stage('Show Files') {
            steps {
                // 'bat' is correct for your Windows-based Jenkins environment
                bat 'dir'
            }
        }
    }
}
