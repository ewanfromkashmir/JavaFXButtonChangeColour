package com.example.fxapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class HelloController
{
    // Initialising counter variable to keep track of circle colour
    // (Could later implement an array of colours to expand the application)
    int counter = 0;

    @FXML
    private Label welcomeText;

    @FXML
    protected Circle circle;

    @FXML
    protected void onHelloButtonClick()
    {
        welcomeText.setText("Press the Mutton Button for a surprise!");
    }

    @FXML
    protected void circleChangeColor()
    {
        // Filling circle with red if counter is 0, then setting counter to 1
        if (counter == 0)
        {
            circle.setFill(Color.rgb(200, 0, 0));
            counter++;
        }

        // Filling circle with green if counter is 1, then setting counter to 2
        else if (counter == 1)
        {
            circle.setFill(Color.rgb(0, 200, 0));
            counter++;
        }

        // Filling circle with blue if counter is neither 0 nor 1, then setting counter to 3
        else
        {
            circle.setFill(Color.rgb(0, 0,200));
            counter = 0;
        }

    }
}