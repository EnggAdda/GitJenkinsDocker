pipeline {
    agent any
    tools{
        maven 'MavenTool'
    }

    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/EnggAdda/GitJenkinsDocker']]])
                bat 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t enggadda/git-jenkins-docker .'
                }
            }
        }
        stage('Push image to Hub'){
            steps{
                script{

                   bat 'docker login'


                   bat 'docker push enggadda/git-jenkins-docker'
                }
            }
        }


        }


}