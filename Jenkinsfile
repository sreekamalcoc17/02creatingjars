pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "Maven3.8.1"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                 git branch: "main", url:'https://github.com/sreekamalcoc17/02creatingjars.git'

                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                    sh "java -jar target/simple01-0.0.1-SNAPSHOT.jar"
                }
            }
        }
    }
}
