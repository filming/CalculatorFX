package me.filming.calculatorfx;

import javafx.application.Application;
import javafx.stage.Stage;

public class CalculatorApp extends Application {
    public void start(Stage primaryStage) {
        Calculator calculator = new Calculator();
    }

    public static void main (String[] args){
        launch(args);
    }
}
