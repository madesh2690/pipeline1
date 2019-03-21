#!groovy

appName="CLK"

pipeline {
  agent {label "master"}
  stages {
     stage ('Build'){
       steps {
          sh "echo ${appName}"
         build(job: 'Madesh-FreeStyle-Test', parameters: [[$class: 'StringParameterValue', name: 'P1', value: 'AAAAA'], [$class: 'StringParameterValue', name: 'P2', value: 'BBBB']])
         //userInput = input( id: 'Procced 2', message: 'Enter panameter', parameters: [$class: 'ChoiceParameterDefinition', name: "ENV_NAME", choices: "madesh", description: "selcte my name"])
               }
         }
     }
}


