package me.filming.calculatorfx;

import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.control.Label;

public class CalculatorView extends Pane {
    TextField outputField;

    Button divideButton;
    Button multiplyButton;
    Button additionButton;
    Button subtractionButton;
    Button equalsButton;

    Button clearButton;
    Button bracketsButton;
    Button percentButton;
    Button signButton;
    Button decimalButton;


    Button oneButton;
    Button twoButton;
    Button threeButton;
    Button fourButton;
    Button fiveButton;
    Button sixButton;
    Button sevenButton;
    Button eightButton;
    Button nineButton;

    public CalculatorView(){
        // set default settings
        setPrefSize(338, 760);
        setStyle("-fx-background-color: #24252F");

        // create output display






        // creating a divider
        Rectangle divider = new Rectangle(10, 300, 318, 2);
        Color customColour = Color.rgb(58, 58, 75);
        divider.setFill(customColour);
        getChildren().add(divider);

        // create buttons
        // clear button
        StackPane clearPane = new StackPane();
        Circle clearButtonCircle = new Circle(36, Color.rgb(60, 61, 78));
        Label clearButtonLabel = new Label("C");
        clearButtonLabel.setTextFill(Color.rgb(231, 121, 51));
        clearButtonLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        clearPane.getChildren().addAll(clearButtonCircle, clearButtonLabel);

        clearButton = new Button("");
        clearButton.setGraphic(clearPane);
        clearButton.setShape(clearButtonCircle);
        clearButton.setMinSize(72, 72);
        clearButton.setMaxSize(72, 72);
        clearButton.setBackground(Background.EMPTY);
        clearButton.setBorder(Border.EMPTY);
        clearButton.setPadding(Insets.EMPTY);
        clearButton.setPickOnBounds(false);
        clearButton.setTranslateX(10);
        clearButton.setTranslateY(320);

        // brackets button
        StackPane bracketsPane = new StackPane();
        Circle bracketsButtonCircle = new Circle(36, Color.rgb(60, 61, 78));
        Label bracketsButtonLabel = new Label("(  )");
        bracketsButtonLabel.setTextFill(Color.rgb(225, 178, 65));
        bracketsButtonLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        bracketsPane.getChildren().addAll(bracketsButtonCircle, bracketsButtonLabel);

        bracketsButton = new Button("");
        bracketsButton.setGraphic(bracketsPane);
        bracketsButton.setShape(bracketsButtonCircle);
        bracketsButton.setMinSize(72, 72);
        bracketsButton.setMaxSize(72, 72);
        bracketsButton.setBackground(Background.EMPTY);
        bracketsButton.setBorder(Border.EMPTY);
        bracketsButton.setPadding(Insets.EMPTY);
        bracketsButton.setPickOnBounds(false);
        bracketsButton.setTranslateX(92);
        bracketsButton.setTranslateY(320);

        // percent button
        StackPane percentPane = new StackPane();
        Circle percentButtonCircle = new Circle(36, Color.rgb(60, 61, 78));
        Label percentButtonLabel = new Label("%");
        percentButtonLabel.setTextFill(Color.rgb(225, 178, 65));
        percentButtonLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        percentPane.getChildren().addAll(percentButtonCircle, percentButtonLabel);

        percentButton = new Button("");
        percentButton.setGraphic(percentPane);
        percentButton.setShape(percentButtonCircle);
        percentButton.setMinSize(72, 72);
        percentButton.setMaxSize(72, 72);
        percentButton.setBackground(Background.EMPTY);
        percentButton.setBorder(Border.EMPTY);
        percentButton.setPadding(Insets.EMPTY);
        percentButton.setPickOnBounds(false);
        percentButton.setTranslateX(174);
        percentButton.setTranslateY(320);

        // divide button
        StackPane dividePane = new StackPane();
        Circle divideButtonCircle = new Circle(36, Color.rgb(60, 61, 78));
        Label divideButtonLabel = new Label("÷");
        divideButtonLabel.setTextFill(Color.rgb(225, 178, 65));
        divideButtonLabel.setFont(Font.font("Arial", FontWeight.BOLD, 36));
        dividePane.getChildren().addAll(divideButtonCircle, divideButtonLabel);

        divideButton = new Button("");
        divideButton.setGraphic(dividePane);
        divideButton.setShape(divideButtonCircle);
        divideButton.setMinSize(72, 72);
        divideButton.setMaxSize(72, 72);
        divideButton.setBackground(Background.EMPTY);
        divideButton.setBorder(Border.EMPTY);
        divideButton.setPadding(Insets.EMPTY);
        divideButton.setPickOnBounds(false);
        divideButton.setTranslateX(256);
        divideButton.setTranslateY(320);

        // number 7 button
        StackPane sevenButtonPane = new StackPane();
        Circle sevenButtonCircle = new Circle(36, Color.rgb(46,47,61));
        Label sevenButtonLabel = new Label("7");
        sevenButtonLabel.setTextFill(Color.rgb(225, 255, 255));
        sevenButtonLabel.setFont(Font.font("Arial", FontWeight.BOLD, 26));
        sevenButtonPane.getChildren().addAll(sevenButtonCircle, sevenButtonLabel);

        sevenButton = new Button("");
        sevenButton.setGraphic(sevenButtonPane);
        sevenButton.setShape(sevenButtonCircle);
        sevenButton.setMinSize(72, 72);
        sevenButton.setMaxSize(72, 72);
        sevenButton.setBackground(Background.EMPTY);
        sevenButton.setBorder(Border.EMPTY);
        sevenButton.setPadding(Insets.EMPTY);
        sevenButton.setPickOnBounds(false);
        sevenButton.setTranslateX(10);
        sevenButton.setTranslateY(400);

        // number 8 button
        StackPane eightButtonPane = new StackPane();
        Circle eightButtonCircle = new Circle(36, Color.rgb(46,47,61));
        Label eightButtonLabel = new Label("8");
        eightButtonLabel.setTextFill(Color.rgb(225, 255, 255));
        eightButtonLabel.setFont(Font.font("Arial", FontWeight.BOLD, 26));
        eightButtonPane.getChildren().addAll(eightButtonCircle, eightButtonLabel);

        eightButton = new Button("");
        eightButton.setGraphic(eightButtonPane);
        eightButton.setShape(eightButtonCircle);
        eightButton.setMinSize(72, 72);
        eightButton.setMaxSize(72, 72);
        eightButton.setBackground(Background.EMPTY);
        eightButton.setBorder(Border.EMPTY);
        eightButton.setPadding(Insets.EMPTY);
        eightButton.setPickOnBounds(false);
        eightButton.setTranslateX(92);
        eightButton.setTranslateY(400);

        // number 9 button
        StackPane nineButtonPane = new StackPane();
        Circle nineButtonCircle = new Circle(36, Color.rgb(46,47,61));
        Label nineButtonLabel = new Label("9");
        nineButtonLabel.setTextFill(Color.rgb(225, 255, 255));
        nineButtonLabel.setFont(Font.font("Arial", FontWeight.BOLD, 26));
        nineButtonPane.getChildren().addAll(nineButtonCircle, nineButtonLabel);

        nineButton = new Button("");
        nineButton.setGraphic(nineButtonPane);
        nineButton.setShape(nineButtonCircle);
        nineButton.setMinSize(72, 72);
        nineButton.setMaxSize(72, 72);
        nineButton.setBackground(Background.EMPTY);
        nineButton.setBorder(Border.EMPTY);
        nineButton.setPadding(Insets.EMPTY);
        nineButton.setPickOnBounds(false);
        nineButton.setTranslateX(174);
        nineButton.setTranslateY(400);

        // multiply button
        StackPane multiplyButtonPane = new StackPane();
        Circle multiplyButtonCircle = new Circle(36, Color.rgb(46,47,61));
        Label multiplyButtonLabel = new Label("X");
        multiplyButtonLabel.setTextFill(Color.rgb(225, 255, 255));
        multiplyButtonLabel.setFont(Font.font("Arial", FontWeight.BOLD, 26));
        multiplyButtonPane.getChildren().addAll(multiplyButtonCircle, multiplyButtonLabel);

        multiplyButton = new Button("");
        multiplyButton.setGraphic(multiplyButtonPane);
        multiplyButton.setShape(multiplyButtonCircle);
        multiplyButton.setMinSize(72, 72);
        multiplyButton.setMaxSize(72, 72);
        multiplyButton.setBackground(Background.EMPTY);
        multiplyButton.setBorder(Border.EMPTY);
        multiplyButton.setPadding(Insets.EMPTY);
        multiplyButton.setPickOnBounds(false);
        multiplyButton.setTranslateX(256);
        multiplyButton.setTranslateY(400);





        getChildren().addAll(
                clearButton, bracketsButton, percentButton, divideButton,
                sevenButton, eightButton, nineButton, multiplyButton
        );
    }

}
