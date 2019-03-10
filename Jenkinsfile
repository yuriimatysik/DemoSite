node {
   def mvnHome
   stage('Checkout') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/efsavage/hello-world-war.git'
      // Get the Maven tool.
      // ** NOTE: This 'Maven' Maven tool must be configured
      // **       in the global configuration.           
      mvnHome = tool 'Maven'
   }
   stage('Build') {
      // Run the maven build
      sh "'${mvnHome}/bin/mvn' clean package"
   }
   stage('Deploy') {
       sshagent(['tomcat_ssh_key']) {
           sh "scp -o StrictHostKeyChecking=no ${workspace}/target/hello-world-war-1.0.0.war tomcat8@10.0.3.91:/var/lib/tomcat8/webapps/"
       }
   }
}
