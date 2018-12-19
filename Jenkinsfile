node('master'){
     

      environment{
        MAVEN_HOME=/usr/share/maven   
        PATH="${MAVEN_HOME}/bin:$PATH"
        }
 
     stage('scm'){
        sh " mkdir -p test"
        writeFile file: "test/test1file.txt", text: "sample file"
        writeFile file: "test/test1file.md", text: "sample1"i
        //sh "echo '$PATH'"
        sh "mvn clean"

                }
}
