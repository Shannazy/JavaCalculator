package Calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage Calculator) throws Exception{
        Calculator.setTitle("Calculations");
        Calculator.setHeight(600);
        Calculator.setWidth(400);
        Calculator.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
