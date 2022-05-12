def call(body) {
def pipelineparams= [:]
body.resolveStragey = Clouser.DELEGATE_FIRST
body.delegate = pipelineparams
body()
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying'
            }
        }
    }
}

}