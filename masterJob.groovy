#!groovy

appName="CLK"

pipeline {
  agent {label "master"}
  stages {
     stage ('Build'){
       steps {
          sh "echo ${appName}"
               }
         }
     }
}


