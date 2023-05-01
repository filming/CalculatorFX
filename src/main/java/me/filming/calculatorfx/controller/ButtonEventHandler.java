package me.filming.calculatorfx.controller;

import javafx.event.ActionEvent;
import javafx.scene.text.Text;
import me.filming.calculatorfx.CalculatorView;

public class ButtonEventHandler {
    CalculatorView view;

    public ButtonEventHandler(CalculatorView initView){
        view = initView;
    }

    public void divideButtonHandler(ActionEvent event){
    }

    public void multiplyButtonHandler(ActionEvent event){
    }

    public void additionButtonHandler(ActionEvent event){

    }

    public void subtractionButtonHandler(ActionEvent event){

    }

    public void clearButtonHandler(ActionEvent event){
        Text clearText = new Text("clear");

        view.update(clearText);
    }

    public void equalsButtonHandler(ActionEvent event){

        System.out.println("equals button was clicked");
    }

    public void backspaceButtonHandler(ActionEvent event){
        Text backspaceText = new Text("backspace");

        view.update(backspaceText);
        System.out.println("backspace button was clicked");
    }

    public void percentButtonHandler(ActionEvent event){
        System.out.println("percent button was clicked");
    }

    public void signButtonHandler(ActionEvent event){
        System.out.println("sign button was clicked");
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
