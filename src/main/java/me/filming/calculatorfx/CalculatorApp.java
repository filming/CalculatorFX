package me.filming.calculatorfx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;

public class CalculatorApp extends Application {
    public void start(Stage primaryStage) {
        Pane  aPane = new Pane();

        // Create a model & view instance
        Calculator calculator = new Calculator();
        CalculatorView view = new CalculatorView();
        aPane.getChildren().add(view);



        primaryStage.setTitle("Calculator");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(aPane));
        primaryStage.show();
    }

    public static void main (String[] args){
        launch(args);
    }
}
