node('master'){

      stage('scm'){
            //sh "echo 'pipeline'"
           sh " mkdir -p test"
           writeFile file: "test/test1file.txt", text: "sample file"
           writeFile file: "test/test1file.md", text: "sample1"


                  }
}
