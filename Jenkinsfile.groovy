pipeline {
 agent any
 stages {
 stage('Checkout Code') {
 steps {
 git 'https://github.com/NoelNinanSheri1307/NoelNinanSheri-JenkinsLab.git'
 }
 }
 stage('Show Files') {
 steps {
 bat 'dir'
 }
 }
 }
}
