package me.filming.calculatorfx;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.ArrayList;
import static java.lang.Double.NaN;

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

    public double evaluateInputs(){
        String equation = "";
        for (String part : currentInputs){
            equation += part;
        }

        double result = previousAnswer;

        String[] parts = equation.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
        result = Double.parseDouble(parts[0]);
        for (int i = 1; i < parts.length; i += 2) {
            String operator = parts[i];
            double operand = Double.parseDouble(parts[i + 1]);
            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "*":
                    result *= operand;
                    break;
                case "/":
                    result /= operand;
                    break;
                case "%":
                    result %= operand;
                    break;
                default:
                    result = NaN;
            }
        }

        previousAnswer = result;
        System.out.println(previousAnswer);
        return result;
    }
}
