package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.InputStream;

public class Main extends Application {
    public final static int MAX = 10;
    Stage primaryStage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("Hust English App");
        Scene scene = new Scene(root, 400, 600);
        scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());

        Image image = new Image(getClass().getResourceAsStream("book.png"));
        primaryStage.getIcons().add(image);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static Student[] students = new Student[10];
    public static int dem = 0;
    static {
        for(int i=0;i<MAX;i++){
            students[i] = new Student();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
