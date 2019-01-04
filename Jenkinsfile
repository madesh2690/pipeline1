node('master'){
    
     stage('scm'){
          deleteDir()
          //git url:'https://github.com/madesh2690/maven-hello-world.git'
          //checkout ([$class: 'GitSCM', branchs: [[name: '*/java7checker']], userRemoteConfigs: [[url: 'https://github.com/madesh2690/maven-hello-world.git']]]) 
 checkout([$class: 'GitSCM',
  branches: [[name: '*/java7checker']],
  userRemoteConfigs: [[url: 'https://github.com/madesh2690/maven-hello-world.git']]])
       
      

                }
     stage('Build'){
          sh "echo '=======Build Started=================='"
          sh "mvn -f my-app/pom.xml clean package"
          sh "echo '=============Buil Succuss============='"
          
          
                }
     stage('SonarQube'){
          }
     
     
}
