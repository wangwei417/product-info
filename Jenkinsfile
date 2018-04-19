node {

   stage('Build') {
      // Run the maven build
      sh "mvn clean package"
   }
   stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
   stage('Deploy'){
 		withAWS(credentials: 'awswwangcredential', region: 'us-east2') {
            
		}  
   }
}