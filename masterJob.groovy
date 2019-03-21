#!groovy

appName="CLK"

pipeline {
  stages {
     stage ('Build'){
          sh "echo ${appName}"

         }
     }
}


