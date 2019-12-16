node {
    stage('Build') {
        if (env.BRANCH_NAME == 'master') {
                echo 'I only execute on the master branch'
                bat 'mvn -B -DskipTests clean package'
            } else {
                echo 'I execute elsewhere'
        }
    }
    stage('Test') {
        bat 'mvn test'
    }
}
