package me.filming.calculatorfx.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class CustomButton {

    private Button button;
    public CustomButton(int x_pos, int y_pos,
                        int circleRed, int circleGreen, int circleBlue,
                        String text, int textSize, int textRed, int textGreen, int textBlue
    ){
        StackPane buttonPane = new StackPane();
        Circle buttonCircle = new Circle(36, Color.rgb(circleRed, circleGreen, circleBlue));
        Label buttonLabel = new Label(text);
        buttonLabel.setTextFill(Color.rgb(textRed, textGreen, textBlue));
        buttonLabel.setFont(Font.font("Arial", FontWeight.BOLD, textSize));
        buttonPane.getChildren().addAll(buttonCircle, buttonLabel);

        button = new Button("");
        button.setGraphic(buttonPane);
        button.setShape(buttonCircle);
        button.setMinSize(72, 72);
        button.setMaxSize(72, 72);
        button.setBackground(Background.EMPTY);
        button.setBorder(Border.EMPTY);
        button.setPadding(Insets.EMPTY);
        button.setPickOnBounds(false);
        button.setTranslateX(x_pos);
        button.setTranslateY(y_pos);
    }

    public Button getButton(){
        return button;
    }
}
