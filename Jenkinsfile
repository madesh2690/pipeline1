node('master'){
     

      environment{
        MAVEN_HOME=/usr/share/maven   
        PATH="${MAVEN_HOME}/bin:$PATH"
        }
 
     stage('scm'){
          git url: 'https://github.com/madesh2690/maven-hello-world.git'
         sh "mvn -f my-app/pom.xml clean"

                }
}
