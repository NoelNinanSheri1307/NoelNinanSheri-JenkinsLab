pipeline {
    agent any
    stages {
        stage('Checkout Code') {
            steps {
                // This points to your actual repository and the main branch
                git branch: 'main', url: 'https://github.com/NoelNinanSheri1307/NoelNinanSheri-JenkinsLab.git'
            }
        }
        stage('Print Directory') {
            steps {
                // This will print the current path in your Windows Jenkins environment
                bat 'cd'
            }
        }
    }
}
