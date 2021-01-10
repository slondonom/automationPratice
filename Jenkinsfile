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
                doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [
                [credentialsId: "DevopsComfama", url: "https://Comfama@dev.azure.com/Comfama/AutomatizacionQA/_git/AutomatizacionQA"]
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
						bat ("gradle clean test -DRunner=\"${Runner}\" aggregate")
						echo 'Test Ejecutados sin Fallo'	
						currentBuild.result = 'SUCCESS'								
					}
					catch(ex) {   					
	    				echo 'Test Ejecutados con Fallo'
	    				currentBuild.result ='UNSTABLE'      						
					}	
				}
			}	
		}		
		stage('Generar Evidencias') {
			steps {
			    script {
			        bat " rename \"${WORKSPACE}\\target\\site\\serenity\" serenity_${timestamp}"
			    }
			    junit "**/build/test-results/**/*.xml"
			    publishHTML(target:[
			        allowMissing: false, 
			        alwaysLinkToLastBuild: true, 
			        keepAll: true, 
			        reportDir: "${WORKSPACE}/target/site/serenity_${timestamp}", 
			        reportFiles: 'ingresamos_a_la_intranet_de_pruebas_y_validamos_datos_afiliados_consultar_afiliados.html',
			        reportName: 'Selenium Report'])
				echo 'Reporte Html realizado con exito'
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