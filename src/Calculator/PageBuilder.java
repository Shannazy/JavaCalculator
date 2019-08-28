package Calculator;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PageBuilder extends Application {

    public void launcher(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage Calculator) throws Exception{
        //Page Set up
        Calculator.setTitle("Calculations");
        Calculator.setHeight(600);
        Calculator.setWidth(400);

        //Scene
        BorderPane starter = new BorderPane();
        NumberPad(starter);
        Operationicons(starter);

        Scene mainPage =  new Scene(starter);
        Calculator.setScene(mainPage);
        Calculator.show();
    }

    private void NumberPad(BorderPane starter){
        //Number pad Set up
        Button num0 = new Button("0");
        num0.setPrefWidth(75);
        num0.setPrefHeight(75);

        Button num1 = new Button("1");
        num1.setPrefWidth(75);
        num1.setPrefHeight(75);

        Button num2 = new Button("2");
        num2.setPrefWidth(75);
        num2.setPrefHeight(75);

        Button num3 = new Button("3");
        num3.setPrefWidth(75);
        num3.setPrefHeight(75);

        Button num4 = new Button("4");
        num4.setPrefWidth(75);
        num4.setPrefHeight(75);

        Button num5 = new Button("5");
        num5.setPrefWidth(75);
        num5.setPrefHeight(75);

        Button num6 = new Button("6");
        num6.setPrefWidth(75);
        num6.setPrefHeight(75);

        Button num7 = new Button("7");
        num7.setPrefWidth(75);
        num7.setPrefHeight(75);

        Button num8 = new Button("8");
        num8.setPrefWidth(75);
        num8.setPrefHeight(75);

        Button num9 = new Button("9");
        num9.setPrefWidth(75);
        num9.setPrefHeight(75);

        GridPane numPad = new GridPane();
        numPad.add(num1, 0, 0);
        numPad.add(num2, 1, 0);
        numPad.add(num3, 2, 0);
        numPad.add(num4, 0, 1);
        numPad.add(num5, 1, 1);
        numPad.add(num6, 2, 1);
        numPad.add(num7, 0, 2);
        numPad.add(num8, 1, 2);
        numPad.add(num9, 2, 2);
        numPad.add(num0, 1, 3);
        numPad.setAlignment(Pos.BOTTOM_CENTER);
        numPad.setHgap(5);
        numPad.setVgap(5);
        starter.setCenter(numPad);

    }

    private void Operationicons(BorderPane starter) {
        //Operations
        Button add = new Button("+");
        add.setPrefHeight(75);
        add.setPrefWidth(75);
        

        Button sub = new Button("-");
        sub.setPrefHeight(75);
        sub.setPrefWidth(75);

        Button div = new Button("\\");
        div.setPrefHeight(75);
        div.setPrefWidth(75);

        Button mult = new Button("*");
        mult.setPrefWidth(75);
        mult.setPrefHeight(75);

        VBox operations = new VBox(add, sub, div, mult);
        operations.setSpacing(5);
        operations.setAlignment(Pos.BOTTOM_CENTER);

        starter.setRight(operations);

    }

}
