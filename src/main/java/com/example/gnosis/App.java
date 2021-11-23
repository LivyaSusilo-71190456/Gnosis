package com.example.gnosis;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * Hello world!
 *
 */
public class App  extends Application
{

    @Override
    public void start(Stage stage) throws Exception {

    
        Parent root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
    
        Scene scene = new Scene(root);

        stage.setTitle("gnosis Bible");
        stage.setScene(scene);
        stage.show();
    }


   

    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        launch(args);

    }
}
