node('master'){
     

      /*environment{
        MAVEN_HOME=/usr/share/maven   
        PATH="${MAVEN_HOME}/bin:$PATH"
        }*/
     
 
     stage('scm'){
          git url:'https://github.com/madesh2690/maven-hello-world.git'
          
          deleteDir()

                }
     stage('Build'){
          checkout ([$class: 'GitSCM', branch: [[name: '/java7checker/]], url:'https://github.com/madesh2690/maven-hello-world.git') 
          sh "echo '=======Build Started=================='"
          sh "mvn -f my-app/pom.xml clean package"
          sh "echo '=============Buil Succuss============='"
          
          
                }
     
     
}
