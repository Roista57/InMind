pipeline {
    agent any

    tools {
        nodejs 'NodeJs 18'
    }

    stages {
        
        stage('BE Test') {
            steps {
                dir('BE'){
                    echo 'Back-End Testing...'
                }
            }
        }
        
        stage('FE Test') {
            steps {
                dir('FE'){
                    echo 'Front-End Testing...'
                }
            }
        }
        
        stage('BE Build') {
            steps {
                sh 'chmod -R 777 .'
                dir('BE'){
                    sh './gradlew clean build'
                }
            }
        }
        
        stage('FE Build') {
            steps {
                sh 'chmod -R 777 .'
                dir('FE') {
                    sh 'npm install'
                    sh 'npm run build'
                }
            }
        }
        
        stage('Docker Compose Down') {
            steps {
                echo 'Stopping and removing existing Docker containers...'
                sh 'docker-compose down || true'
            }
        }
        
        stage('Docker Compose Up') {
            steps {
                echo 'Deploying Docker containers...'
                sh 'docker-compose up -d'
            }
        }
        
        stage('Show Nginx Configuration') {
            steps {
                echo 'Showing Nginx Configuration...'
                sh 'docker exec $(docker ps -qf "name=nginx") cat /etc/nginx/nginx.conf'
            }
        }
    }
}
