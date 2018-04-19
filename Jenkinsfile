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
 		sh "aws ec2 describe-security-groups"
   }
}