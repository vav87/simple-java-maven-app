node {
    git url: 'https://github.com/vav87/simple-java-maven-app.git', branch: env.BRANCH_NAME

    stage('Build') {
        if (env.BRANCH_NAME == 'master') {
            echo 'Executing on the local_master branch'
            bat 'mvn -DskipTests clean package'
        } else {
            echo 'Executing on another branch'
        }
    }
    stage('Test') {
        bat 'mvn test'
    }
    stage('Example Deploy'){
        echo 'Deploying process'
    }
    stage('Some another stage'){
        echo 'Some another stage'
    }
}
