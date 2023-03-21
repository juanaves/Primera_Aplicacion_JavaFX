//este modulo es para evitar el error de javaFX si no existe este archivo lo daria
//Error: JavaFX runtime components are missing, and are required to run this application

//otra forma de evitar ese error es como en el ejemplo de cochesFXM que esta configurando la aplicacion de
//la  siguiente forma:
//vamos a Run/Edit Configuration/Build and Rund -- pulsar sobre Modify option elegir Add VM option
// y poner lo siguiente en el recuadro que nos saldra:
//--module-path "C:\LIbreriasjava\javafx-sdk-19\lib" --add-modules javafx.controls,javafx.fxml

//asi tambien evitaremos el famoso ERROR

module com.example.demo3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.Primera_Aplicacion_JavaFX to javafx.fxml;
    exports com.example.Primera_Aplicacion_JavaFX;
}