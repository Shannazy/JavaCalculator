package Calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {


    @Override
    public void start(Stage Calculator) throws Exception{
        //Page Set up
        Calculator.setTitle("Calculations");
        Calculator.setHeight(600);
        Calculator.setWidth(400);
        Calculator.setFullScreen(true);
        Calculator.show();

        //Scene setup
        BorderPane starter = new BorderPane(new Label("This the start page"));
        Scene mainPage =  new Scene( starter);
        Calculator.setScene(mainPage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
