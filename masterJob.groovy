#!groovy

appName="CLK"

pipeline {
  agent {label "master"}
  stages {
     stage ('Build'){
       steps {
          sh "echo ${appName}"
          userInput = input( id: 'Procced 2', message: 'Enter panameter', parameters: [$class: 'ChoiceParameterDefinition', name: "ENV_NAME", choice: "madesh", description: "selcte my name"]
               }
         }
     }
}


