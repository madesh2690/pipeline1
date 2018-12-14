node('master'){
     
     //stage('Preparion'){
           // mvnHome=/usr/share/maven/
           // sh "mvn -v"
                  // }

    enviroment{
           PATH="/usr/share/maven/bin:$PATH"
        }
 
 
       stage('scm'){
           sh " mkdir -p test"
           writeFile file: "test/test1file.txt", text: "sample file"
           writeFile file: "test/test1file.md", text: "sample1"i
           sh "mvn -v"


                  }
}
