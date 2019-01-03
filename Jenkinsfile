node('master'){
     

      /*environment{
        MAVEN_HOME=/usr/share/maven   
        PATH="${MAVEN_HOME}/bin:$PATH"
        }*/
     
 
     stage('scm'){
          git url: 'https://github.com/bobbalababu/JenkinsOnEC2MavenProject.git'
         sh "mvn clean package"

                }
}
