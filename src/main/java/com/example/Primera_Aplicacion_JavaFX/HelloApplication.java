package com.example.Primera_Aplicacion_JavaFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Controller controller = new Controller();
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("sample.fxml"));
        loader.setController(controller);
        Scene scene = new Scene(loader.load(), 320, 240);
        stage.setTitle("Mi Primera Aplicacion JavaFX");
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}