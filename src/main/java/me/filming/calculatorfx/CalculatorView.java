package me.filming.calculatorfx;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.*;

import me.filming.calculatorfx.view.CustomButton;
import me.filming.calculatorfx.controller.ButtonEventHandler;

public class CalculatorView extends Pane {
    TextFlow displayTextFlow;

    Button divideButton;
    Button multiplyButton;
    Button additionButton;
    Button subtractionButton;
    Button equalsButton;

    Button clearButton;
    Button backspaceButton;
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

    public CalculatorView(Calculator initModel){
        ButtonEventHandler buttonEventHandler = new ButtonEventHandler(this, initModel);

        // set default settings
        setPrefSize(338, 738);
        setStyle("-fx-background-color: #24252F");

        // create output display
        displayTextFlow = new TextFlow();
        displayTextFlow.setPrefSize(338, 50);
        displayTextFlow.setStyle("-fx-font-size: 24px;");
        displayTextFlow.setTextAlignment(TextAlignment.RIGHT);

        getChildren().add(displayTextFlow);

        // creating a divider
        Rectangle divider = new Rectangle(10, 300, 318, 2);
        Color customColour = Color.rgb(58, 58, 75);
        divider.setFill(customColour);
        getChildren().add(divider);

        // create buttons
        // clear button
        CustomButton clearCustomButton = new CustomButton(10, 320,
                60, 61, 78,
                "C", 26, 231, 121, 51);

        clearButton = clearCustomButton.getButton();
        clearButton.setOnAction(buttonEventHandler::clearButtonHandler);

        // backspace button
        CustomButton backspaceCustomButton = new CustomButton(92, 320,
                60, 61, 78,
                "⌫", 36, 225, 178, 65);

        backspaceButton = backspaceCustomButton.getButton();
        backspaceButton.setOnAction(buttonEventHandler::backspaceButtonHandler);

        // percent button
        CustomButton percentCustomButton = new CustomButton(174, 320,
                60, 61, 78,
                "%", 26, 225, 178, 65);

        percentButton = percentCustomButton.getButton();
        percentButton.setOnAction(buttonEventHandler::percentButtonHandler);

        // divide button
        CustomButton divideCustomButton = new CustomButton(256, 320,
                60, 61, 78,
                "÷", 36, 225, 178, 65);

        divideButton = divideCustomButton.getButton();
        divideButton.setOnAction(buttonEventHandler::divideButtonHandler);

        // number 7 button
        CustomButton sevenCustomButton = new CustomButton(10, 402,
                46, 47, 61,
                "7", 26,255, 255, 255);

        sevenButton = sevenCustomButton.getButton();
        sevenButton.setOnAction(buttonEventHandler::sevenButtonHandler);

        // number 8 button
        CustomButton eightCustomButton = new CustomButton(92, 402,
                46, 47, 61,
                "8", 26,255, 255, 255);

        eightButton = eightCustomButton.getButton();
        eightButton.setOnAction(buttonEventHandler::eightButtonHandler);

        // number 9 button
        CustomButton nineCustomButton = new CustomButton(174, 402,
                46, 47, 61,
                "9", 26, 255, 255, 255);

        nineButton = nineCustomButton.getButton();
        nineButton.setOnAction(buttonEventHandler::nineButtonHandler);

        // multiply button
        CustomButton multiplyCustomButton = new CustomButton(256, 402,
                46, 47, 61,
                "X", 26, 225, 178, 65);

        multiplyButton = multiplyCustomButton.getButton();
        multiplyButton.setOnAction(buttonEventHandler::multiplyButtonHandler);

        // number 4 button
        CustomButton fourCustomButton = new CustomButton(10, 484,
                46,47, 61,
                "4", 26,255, 255, 255);

        fourButton = fourCustomButton.getButton();
        fourButton.setOnAction(buttonEventHandler::fourButtonHandler);

        // number 5 button
        CustomButton fiveCustomButton = new CustomButton(92, 484,
                46, 47, 61,
                "5", 26, 255, 255, 255);

        fiveButton = fiveCustomButton.getButton();
        fiveButton.setOnAction(buttonEventHandler::fiveButtonHandler);

        // number 6 button
        CustomButton sixCustomButton = new CustomButton(174, 484,
                46, 47, 61,
                "6", 26, 255, 255, 255);

        sixButton = sixCustomButton.getButton();
        sixButton.setOnAction(buttonEventHandler::sixButtonHandler);

        // subtract button
        CustomButton subtractionCustomButton = new CustomButton(256, 484,
                46, 47, 61,
                "━", 26, 225, 178, 65);

        subtractionButton = subtractionCustomButton.getButton();
        subtractionButton.setOnAction(buttonEventHandler::subtractionButtonHandler);

        // number 1 button
        CustomButton oneCustomButton = new CustomButton(10, 566,
                46, 47, 61,
                "1", 26, 255, 255, 255);

        oneButton = oneCustomButton.getButton();
        oneButton.setOnAction(buttonEventHandler::oneButtonHandler);

        // number 2 button
        CustomButton twoCustomButton = new CustomButton(92, 566,
                46, 47, 61,
                "2", 26, 255, 255, 255);

        twoButton = twoCustomButton.getButton();
        twoButton.setOnAction(buttonEventHandler::twoButtonHandler);

        // number 3 button
        CustomButton threeCustomButton = new CustomButton(174, 566, 46, 47, 61,
                "3", 26, 255, 255, 255);

        threeButton = threeCustomButton.getButton();
        threeButton.setOnAction(buttonEventHandler::threeButtonHandler);

        // addition button
        CustomButton additionCustomButton = new CustomButton(256, 566,
                46, 47, 61,
                "+", 36, 255, 255, 255);

        additionButton = additionCustomButton.getButton();
        additionButton.setOnAction(buttonEventHandler::additionButtonHandler);

        // sign button
        CustomButton signCustomButton = new CustomButton(10, 648,
                46, 47, 61,
                "+/-", 26, 255, 255, 255);

        signButton = signCustomButton.getButton();
        signButton.setOnAction(buttonEventHandler::signButtonHandler);

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
                clearButton, backspaceButton, percentButton, divideButton,
                sevenButton, eightButton, nineButton, multiplyButton,
                fourButton, fiveButton, sixButton, subtractionButton,
                oneButton, twoButton, threeButton, additionButton,
                signButton, zeroButton, decimalButton, equalsButton
        );
    }

    public void update(Text buttonInput){
        if (buttonInput.getText().equals("clear")) {
            displayTextFlow.getChildren().clear();
        }
        else if (buttonInput.getText().equals("backspace")){
            int lastChildIndex = displayTextFlow.getChildren().size() - 1;

            if (lastChildIndex > 0){
                displayTextFlow.getChildren().remove(lastChildIndex);
            }
        }
        else {
            displayTextFlow.getChildren().add(buttonInput);
        }
    }

    public TextFlow getDisplayTextFlow(){
        return displayTextFlow;
    }
}
