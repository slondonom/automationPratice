#language: es
  #Autor: jdoradoc@choucairtesting.com

  Característica: Registro en la pagina de Utest.com

    Como usuario
    Quiero ingresar a la pagina de Utest
    Y realizar el registro exitoso
  @tag1
  Escenario: Registro exitoso pagina Utest

    Dado que Jesus ingresa a la pagina de Utest
    Cuando diligencia el formulario de registro con sus datos
    |nombre|apellido|correo|mes|dia|ano|idioma|ciudad|codigoPostal|pais|contrasena|
    |andres|durango |correo123@correo.com|December|15|1991|Spanish|Medellín|050001|Colombia|Dor@do2020|
    Entonces verifica que el registro sea exitoso
