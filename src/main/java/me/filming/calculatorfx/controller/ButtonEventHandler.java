package me.filming.calculatorfx.controller;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import me.filming.calculatorfx.Calculator;
import me.filming.calculatorfx.CalculatorView;

public class ButtonEventHandler {
    String currentNumber;
    Calculator model;
    CalculatorView view;

    public ButtonEventHandler(CalculatorView initView, Calculator initModel){
        model = initModel;
        view = initView;
    }

    public void divideButtonHandler(ActionEvent event){
        currentNumber = "";
        for (Node element : view.getDisplayTextFlow().getChildren()){
            currentNumber += ((Text)element).getText();
        }

        currentNumber += "/";
        model.addInput(currentNumber);

        Text clearText = new Text("clear");
        view.update(clearText);
    }

    public void multiplyButtonHandler(ActionEvent event){
        currentNumber = "";
        for (Node element : view.getDisplayTextFlow().getChildren()){
            currentNumber += ((Text)element).getText();
        }

        currentNumber += "*";
        model.addInput(currentNumber);

        Text clearText = new Text("clear");
        view.update(clearText);
    }

    public void additionButtonHandler(ActionEvent event){
        currentNumber = "";
        for (Node element : view.getDisplayTextFlow().getChildren()){
            currentNumber += ((Text)element).getText();
        }

        currentNumber += "+";
        model.addInput(currentNumber);

        Text clearText = new Text("clear");
        view.update(clearText);
    }

    public void subtractionButtonHandler(ActionEvent event){
        currentNumber = "";
        for (Node element : view.getDisplayTextFlow().getChildren()){
            currentNumber += ((Text)element).getText();
        }

        currentNumber += "-";
        model.addInput(currentNumber);

        Text clearText = new Text("clear");
        view.update(clearText);
    }

    public void clearButtonHandler(ActionEvent event){
        Text clearText = new Text("clear");

        view.update(clearText);
    }

    public void equalsButtonHandler(ActionEvent event){
        currentNumber = "";
        for (Node element : view.getDisplayTextFlow().getChildren()){
            currentNumber += ((Text)element).getText();
        }

        model.addInput(currentNumber);

        Text clearText = new Text("clear");
        view.update(clearText);

        double result = model.evaluateInputs();
        view.getDisplayTextFlow().getChildren().clear();


        Text resultText = new Text("" + result);
        resultText.setStyle("-fx-font-size: 36px; -fx-fill: #ea6805");

        view.getDisplayTextFlow().getChildren().add(resultText);
        System.out.println("equals button was clicked");
    }

    public void backspaceButtonHandler(ActionEvent event){
        Text backspaceText = new Text("backspace");

        view.update(backspaceText);
    }

    public void percentButtonHandler(ActionEvent event){
        currentNumber = "";
        for (Node element : view.getDisplayTextFlow().getChildren()){
            currentNumber += ((Text)element).getText();
        }

        currentNumber += "%";
        model.addInput(currentNumber);

        Text clearText = new Text("clear");
        view.update(clearText);
    }

    public void signButtonHandler(ActionEvent event){
        String currentNumber = "";
        for (Node element : view.getDisplayTextFlow().getChildren()){
            currentNumber += ((Text)element).getText();
        }

        double tempCurrentNumber = Double.parseDouble(currentNumber);
        tempCurrentNumber *= -1;

        currentNumber = "" + tempCurrentNumber;
        model.addInput(currentNumber);

        Text clearText = new Text("clear");
        view.update(clearText);
    }

    public void decimalButtonHandler(ActionEvent event){
        Text decimalText = new Text(".");
        decimalText.setStyle("-fx-font-size: 36px; -fx-fill: #FFFFFF");

        view.update(decimalText);
    }

    public void zeroButtonHandler(ActionEvent event){
        Text zeroText = new Text("0");
        zeroText.setStyle("-fx-font-size: 36px; -fx-fill: #FFFFFF");

        view.update(zeroText);
    }

    public void oneButtonHandler(ActionEvent event){
        Text oneText = new Text("1");
        oneText.setStyle("-fx-font-size: 36px; -fx-fill: #FFFFFF");

        view.update(oneText);
    }

    public void twoButtonHandler(ActionEvent event){
        Text twoText = new Text("2");
        twoText.setStyle("-fx-font-size: 36px; -fx-fill: #FFFFFF");

        view.update(twoText);
    }

    public void threeButtonHandler(ActionEvent event){
        Text threeText = new Text("3");
        threeText.setStyle("-fx-font-size: 36px; -fx-fill: #FFFFFF");

        view.update(threeText);
    }

    public void fourButtonHandler(ActionEvent event){
        Text fourText = new Text("4");
        fourText.setStyle("-fx-font-size: 36px; -fx-fill: #FFFFFF");

        view.update(fourText);
    }

    public void fiveButtonHandler(ActionEvent event){
        Text fiveText = new Text("5");
        fiveText.setStyle("-fx-font-size: 36px; -fx-fill: #FFFFFF");

        view.update(fiveText);
    }

    public void sixButtonHandler(ActionEvent event){
        Text sixText = new Text("6");
        sixText.setStyle("-fx-font-size: 36px; -fx-fill: #FFFFFF");

        view.update(sixText);
    }

    public void sevenButtonHandler(ActionEvent event){
        Text sevenText = new Text("7");
        sevenText.setStyle("-fx-font-size: 36px; -fx-fill: #FFFFFF");

        view.update(sevenText);
    }

    public void eightButtonHandler(ActionEvent event){
        Text eightText = new Text("8");
        eightText.setStyle("-fx-font-size: 36px; -fx-fill: #FFFFFF");

        view.update(eightText);
    }

    public void nineButtonHandler(ActionEvent event){
        Text nineText = new Text("9");
        nineText.setStyle("-fx-font-size: 36px; -fx-fill: #FFFFFF");

        view.update(nineText);
    }
}
