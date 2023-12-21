pipeline
{
  agent any
  stages{
    stage("Clean"){
      steps{
         bat "mvn clean"
      }
    }
     stage("Test"){
      steps{
        bat "mvn test"
      }
    }
     stage("Build"){
      steps{
         bat "mvn package"
      }
    }
    stage("Capture results"){
      steps{
        input("Do you want to capture results ?")
        junit '**/target/surefire-reports/TEST-*.xml'   
        archive "target/*.jar"
      }
    }
     stage("Email Results"){
      steps{
        emailext body: '', subject: 'Jenkins Calculator Pipeline status', to: 'rvmakawana@gmail.com'
      }
    }
  }
}
