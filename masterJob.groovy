#!groovy

appName="CLK"

pipeline {
  agent {label "master"}
  parameters {
    choice ( name: 'Nodes', choices: "Linux\nMac", description: "Chosee Nodes!")
          }
            stages {
     stage ('Build'){
       steps {
          sh "echo ${appName}"
         build(job: 'Madesh-FreeStyle-Test', parameters: [[name: 'P1', value: '${params.Nodes}'], [$class: 'StringParameterValue', name: 'P2', value: 'BBBB']])
         //userInput = input( id: 'Procced 2', message: 'Enter panameter', parameters: [$class: 'ChoiceParameterDefinition', name: "ENV_NAME", choices: "madesh", description: "selcte my name"])
               }
         }
     }
}


