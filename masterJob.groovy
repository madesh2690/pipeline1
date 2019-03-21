#!groovy

appName="CLK"

pipeline {
  stages {
     stage ('Build'){
       steps {
          sh "echo ${appName}"
               }
         }
     }
}


