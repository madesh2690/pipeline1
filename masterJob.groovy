#!groovy

appName="CLK"

pipeline {
  agent {'master'}
  stages {
     stage ('Build'){
       steps {
          sh "echo ${appName}"
               }
         }
     }
}


