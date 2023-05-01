package me.filming.calculatorfx;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Calculator {
    private double previousAnswer;
    private ArrayList<String> currentInputs;

    public Calculator(){
        previousAnswer = 0;
        currentInputs = new ArrayList();
    }

    public double getPreviousAnswer() {
        return previousAnswer;
    }

    public void addInput(String newInput){
        currentInputs.add(newInput);
    }
}
