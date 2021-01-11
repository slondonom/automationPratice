import java.text.SimpleDateFormat

def dateFormat = new SimpleDateFormat("yyyyMMddHHmm")
def date = new Date()
def timestamp = dateFormat.format(date).toString()
def CORREOS = "slondonom@choucairtesting.com"
pipeline{
	agent any
	triggers {cron('H 9 * * 1-5')}
	stages {
		stage('Obtener Fuentes') 
		{		
		 	steps 
		 	{
				checkout([$class: 'GitSCM', branches: [[name: "master"]], 
                wdoGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [
                [credentialsId: "slondonom", url: "https://github.com/slondonom/automationPratice"]
                ]])
			}
		}
		/*
		stage('Analisis SonarQube') 
		{
            steps 
            {
				withSonarQubeEnv() 
    			{ // Will pick the global server connection you have configured
      				sh './gradlew sonarqube'
                }
            }
        }
        
        stage("Quality Gate") 
        {
            steps {
                timeout(time: 1, unit: 'HOURS') {
                    // Parameter indicates whether to set pipeline to UNSTABLE if Quality Gate fails
                    // true = set pipeline to UNSTABLE, false = don't
                    waitForQualityGate abortPipeline: true
                }
            }
         }
         */
        
		stage('Ejecutar Pruebas') {
                    steps {
                        script {
                            try {
                                //bat ("gradle clean test -DRunner=\"${Runner}\" aggregate") //Ejecución en agente Windows con parametro jenkins
                                //sh ("gradle clean test -DRunner=\"${Runner}\" aggregate") //Ejecución en agente Linux con parametro jenkins
                                bat("gradle clean test aggregate") //Ejecución en agente windows sin parametro jenkins
                                echo 'Test Ejecutados sin Fallo'
                                currentBuild.result = 'SUCCESS'
                            }
                            catch (ex) {
                                echo 'Test Ejecutados con Fallo'
                                currentBuild.result = 'UNSTABLE'
                            }
                        }
                    }
                }
		stage('Generar evidencia'){
                    steps
                            {
                                script
                                        {
                                            try
                                            {
                                                bat  " rename \"${WORKSPACE}\\target\" serenity_${timestamp}"
                                                echo 'Backup de evidencias realizado con exito'

                                                publishHTML([
                                                        allowMissing: false,
                                                        alwaysLinkToLastBuild: true,
                                                        keepAll: true,
                                                        reportDir: "${WORKSPACE}//serenity_${timestamp}",
                                                        reportFiles: 'index.html',
                                                        reportName: 'Evidencias Automatizacion WEB POM',
                                                        reportTitles: 'Proyecto Base WEB POM'
                                                ])
                                                echo 'Reporte Html realizado con exito'
                                            }
                                            catch(e)
                                            {
                                                echo 'No se realizo el Backup de evidencias'
                                                publishHTML([allowMissing: false, alwaysLinkToLastBuild: true, keepAll: true, reportDir: "${WORKSPACE}//target/serenity_${timestamp}", reportFiles: 'index.html', reportName: 'Evidencias Automatizacion WEB POM', reportTitles: 'Proyecto base WEB POM'])
                                                echo 'Reporte Html realizado con exito'
                                                currentBuild.result='SUCCESS'
                                            }
                                        }
                            }
                }
		/*
		stage('Notificar') {
			steps {
				script {								
					if (currentBuild.result == 'UNSTABLE')
         				currentBuild.result = 'FAILURE'
         						
         			if (currentBuild.result == 'SUCCESS')
   						emailext(
							subject: "AFILIADOS - EJECUCION EXITOSA ESCENARIOS: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
          					body: """<p><b style="color:MediumSeaGreen;">EJECUCION EXITOSA:</b> Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
            				<p><b>Para verificar el estado de la ejecucion ingrese a:</b> &QUOT;<a href='${env.BUILD_URL}'>${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>&QUOT;</p>""",
         					to:"${CORREOS}"
        				)
        			if (currentBuild.result == 'FAILURE')	
    					emailext(
          					subject: "AFILIADOS - EJECUCION FALLIDA ESCENARIOS: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
          					body: """<p><b style="color:red;">EJECUCION FALLIDA:</b> Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
            				<p><b>Para verificar el estado de la ejecucion ingrese a:</b> &QUOT;<a href='${env.BUILD_URL}'>${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>&QUOT;</p>""",
         					to:"${CORREOS}"
        				)					
				}
			}	
		}*/
	}	
}