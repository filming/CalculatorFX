package me.filming.calculatorfx;

import javafx.geometry.Insets;
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
import javafx.scene.paint.Color;
import javafx.scene.control.Label;

import me.filming.calculatorfx.controller.ButtonEventHandler;
import me.filming.calculatorfx.view.CustomButton;


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


    Button zeroButton;
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
        ButtonEventHandler buttonEventHandler = new ButtonEventHandler();

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
        sevenButton.setTranslateY(402);

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
        eightButton.setTranslateY(402);

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
        nineButton.setTranslateY(402);

        // multiply button
        StackPane multiplyButtonPane = new StackPane();
        Circle multiplyButtonCircle = new Circle(36, Color.rgb(46,47,61));
        Label multiplyButtonLabel = new Label("X");
        multiplyButtonLabel.setTextFill(Color.rgb(225, 178, 65));
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
        multiplyButton.setTranslateY(402);

        // number 4 button
        StackPane fourButtonPane = new StackPane();
        Circle fourButtonCircle = new Circle(36, Color.rgb(46,47,61));
        Label fourButtonLabel = new Label("4");
        fourButtonLabel.setTextFill(Color.rgb(225, 255, 255));
        fourButtonLabel.setFont(Font.font("Arial", FontWeight.BOLD, 26));
        fourButtonPane.getChildren().addAll(fourButtonCircle, fourButtonLabel);

        fourButton = new Button("");
        fourButton.setGraphic(fourButtonPane);
        fourButton.setShape(fourButtonCircle);
        fourButton.setMinSize(72, 72);
        fourButton.setMaxSize(72, 72);
        fourButton.setBackground(Background.EMPTY);
        fourButton.setBorder(Border.EMPTY);
        fourButton.setPadding(Insets.EMPTY);
        fourButton.setPickOnBounds(false);
        fourButton.setTranslateX(10);
        fourButton.setTranslateY(484);

        // number 5 button
        StackPane fiveButtonPane = new StackPane();
        Circle fiveButtonCircle = new Circle(36, Color.rgb(46,47,61));
        Label fiveButtonLabel = new Label("5");
        fiveButtonLabel.setTextFill(Color.rgb(225, 255, 255));
        fiveButtonLabel.setFont(Font.font("Arial", FontWeight.BOLD, 26));
        fiveButtonPane.getChildren().addAll(fiveButtonCircle, fiveButtonLabel);

        fiveButton = new Button("");
        fiveButton.setGraphic(fiveButtonPane);
        fiveButton.setShape(fiveButtonCircle);
        fiveButton.setMinSize(72, 72);
        fiveButton.setMaxSize(72, 72);
        fiveButton.setBackground(Background.EMPTY);
        fiveButton.setBorder(Border.EMPTY);
        fiveButton.setPadding(Insets.EMPTY);
        fiveButton.setPickOnBounds(false);
        fiveButton.setTranslateX(92);
        fiveButton.setTranslateY(484);

        // number 6 button
        StackPane sixButtonPane = new StackPane();
        Circle sixButtonCircle = new Circle(36, Color.rgb(46,47,61));
        Label sixButtonLabel = new Label("6");
        sixButtonLabel.setTextFill(Color.rgb(225, 255, 255));
        sixButtonLabel.setFont(Font.font("Arial", FontWeight.BOLD, 26));
        sixButtonPane.getChildren().addAll(sixButtonCircle, sixButtonLabel);

        sixButton = new Button("");
        sixButton.setGraphic(sixButtonPane);
        sixButton.setShape(sixButtonCircle);
        sixButton.setMinSize(72, 72);
        sixButton.setMaxSize(72, 72);
        sixButton.setBackground(Background.EMPTY);
        sixButton.setBorder(Border.EMPTY);
        sixButton.setPadding(Insets.EMPTY);
        sixButton.setPickOnBounds(false);
        sixButton.setTranslateX(174);
        sixButton.setTranslateY(484);

        // subtract button
        StackPane subtractionButtonPane = new StackPane();
        Circle subtractionButtonCircle = new Circle(36, Color.rgb(46,47,61));
        Label subtractionButtonLabel = new Label("━");
        subtractionButtonLabel.setTextFill(Color.rgb(225, 178, 65));
        subtractionButtonLabel.setFont(Font.font("Arial", FontWeight.BOLD, 26));
        subtractionButtonPane.getChildren().addAll(subtractionButtonCircle, subtractionButtonLabel);

        subtractionButton = new Button("");
        subtractionButton.setGraphic(subtractionButtonPane);
        subtractionButton.setShape(subtractionButtonCircle);
        subtractionButton.setMinSize(72, 72);
        subtractionButton.setMaxSize(72, 72);
        subtractionButton.setBackground(Background.EMPTY);
        subtractionButton.setBorder(Border.EMPTY);
        subtractionButton.setPadding(Insets.EMPTY);
        subtractionButton.setPickOnBounds(false);
        subtractionButton.setTranslateX(256);
        subtractionButton.setTranslateY(484);

        // number 1 button
        StackPane oneButtonPane = new StackPane();
        Circle oneButtonCircle = new Circle(36, Color.rgb(46,47,61));
        Label oneButtonLabel = new Label("1");
        oneButtonLabel.setTextFill(Color.rgb(225, 255, 255));
        oneButtonLabel.setFont(Font.font("Arial", FontWeight.BOLD, 26));
        oneButtonPane.getChildren().addAll(oneButtonCircle, oneButtonLabel);

        oneButton = new Button("");
        oneButton.setGraphic(oneButtonPane);
        oneButton.setShape(oneButtonCircle);
        oneButton.setMinSize(72, 72);
        oneButton.setMaxSize(72, 72);
        oneButton.setBackground(Background.EMPTY);
        oneButton.setBorder(Border.EMPTY);
        oneButton.setPadding(Insets.EMPTY);
        oneButton.setPickOnBounds(false);
        oneButton.setTranslateX(10);
        oneButton.setTranslateY(566);

        // number 2 button
        StackPane twoButtonPane = new StackPane();
        Circle twoButtonCircle = new Circle(36, Color.rgb(46,47,61));
        Label twoButtonLabel = new Label("2");
        twoButtonLabel.setTextFill(Color.rgb(225, 255, 255));
        twoButtonLabel.setFont(Font.font("Arial", FontWeight.BOLD, 26));
        twoButtonPane.getChildren().addAll(twoButtonCircle, twoButtonLabel);

        twoButton = new Button("");
        twoButton.setGraphic(twoButtonPane);
        twoButton.setShape(twoButtonCircle);
        twoButton.setMinSize(72, 72);
        twoButton.setMaxSize(72, 72);
        twoButton.setBackground(Background.EMPTY);
        twoButton.setBorder(Border.EMPTY);
        twoButton.setPadding(Insets.EMPTY);
        twoButton.setPickOnBounds(false);
        twoButton.setTranslateX(92);
        twoButton.setTranslateY(566);

        // number 3 button
        StackPane threeButtonPane = new StackPane();
        Circle threeButtonCircle = new Circle(36, Color.rgb(46,47,61));
        Label threeButtonLabel = new Label("3");
        threeButtonLabel.setTextFill(Color.rgb(225, 255, 255));
        threeButtonLabel.setFont(Font.font("Arial", FontWeight.BOLD, 26));
        threeButtonPane.getChildren().addAll(threeButtonCircle, threeButtonLabel);

        threeButton = new Button("");
        threeButton.setGraphic(threeButtonPane);
        threeButton.setShape(threeButtonCircle);
        threeButton.setMinSize(72, 72);
        threeButton.setMaxSize(72, 72);
        threeButton.setBackground(Background.EMPTY);
        threeButton.setBorder(Border.EMPTY);
        threeButton.setPadding(Insets.EMPTY);
        threeButton.setPickOnBounds(false);
        threeButton.setTranslateX(174);
        threeButton.setTranslateY(566);

        // addition button
        StackPane additionButtonPane = new StackPane();
        Circle additionButtonCircle = new Circle(36, Color.rgb(46,47,61));
        Label additionButtonLabel = new Label("+");
        additionButtonLabel.setTextFill(Color.rgb(225, 178, 65));
        additionButtonLabel.setFont(Font.font("Arial", FontWeight.BOLD, 36));
        additionButtonPane.getChildren().addAll(additionButtonCircle, additionButtonLabel);

        additionButton = new Button("");
        additionButton.setGraphic(additionButtonPane);
        additionButton.setShape(additionButtonCircle);
        additionButton.setMinSize(72, 72);
        additionButton.setMaxSize(72, 72);
        additionButton.setBackground(Background.EMPTY);
        additionButton.setBorder(Border.EMPTY);
        additionButton.setPadding(Insets.EMPTY);
        additionButton.setPickOnBounds(false);
        additionButton.setTranslateX(256);
        additionButton.setTranslateY(566);

        // sign button
        StackPane signButtonPane = new StackPane();
        Circle signButtonCircle = new Circle(36, Color.rgb(46,47,61));
        Label signButtonLabel = new Label("+/-");
        signButtonLabel.setTextFill(Color.rgb(225, 255, 255));
        signButtonLabel.setFont(Font.font("Arial", FontWeight.BOLD, 26));
        signButtonPane.getChildren().addAll(signButtonCircle, signButtonLabel);

        signButton = new Button("");
        signButton.setGraphic(signButtonPane);
        signButton.setShape(signButtonCircle);
        signButton.setMinSize(72, 72);
        signButton.setMaxSize(72, 72);
        signButton.setBackground(Background.EMPTY);
        signButton.setBorder(Border.EMPTY);
        signButton.setPadding(Insets.EMPTY);
        signButton.setPickOnBounds(false);
        signButton.setTranslateX(10);
        signButton.setTranslateY(648);

        // number 0 button
        CustomButton zeroCustomButton = new CustomButton(92, 648,
                46, 47, 61,
                "0", 26, 255, 255, 255);

        zeroButton = zeroCustomButton.getButton();
        zeroButton.setOnAction(buttonEventHandler::zeroButtonHandler);


        // decimal button
        CustomButton decimalCustomButton = new CustomButton(174, 648,
                46, 47, 61,
                ".", 26, 255, 255, 255);

        decimalButton = decimalCustomButton.getButton();
        decimalButton.setOnAction(buttonEventHandler::decimalButtonHandler);

        // equals button
        CustomButton equalsCustomButton = new CustomButton(256, 648,
                231, 182, 65,
                "═", 36, 255, 255, 255);

        equalsButton = equalsCustomButton.getButton();
        equalsButton.setOnAction(buttonEventHandler::equalsButtonHandler);

        getChildren().addAll(
                clearButton, bracketsButton, percentButton, divideButton,
                sevenButton, eightButton, nineButton, multiplyButton,
                fourButton, fiveButton, sixButton, subtractionButton,
                oneButton, twoButton, threeButton, additionButton,
                signButton, zeroButton, decimalButton, equalsButton
        );
    }

    public Button getEqualsButton(){
        return getEqualsButton();
    }



}
