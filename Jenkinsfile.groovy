pipeline {
    agent any
    stages {
        stage('Checkout Code') {
            steps {
                // Pointing to your actual GitHub Lab repository
                git branch: 'main', url: 'https://github.com/NoelNinanSheri1307/NoelNinanSheri-JenkinsLab.git'
            }
        }
        stage('Create File') {
            steps {
                // Creates a file named demo.txt in the workspace
                bat 'echo This file is created by Jenkins > demo.txt'
            }
        }
        stage('Verify File') {
            steps {
                // Reads the file back to prove it was created
                bat 'type demo.txt'
            }
        }
    }
}
