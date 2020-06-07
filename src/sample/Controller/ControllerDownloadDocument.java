package sample.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import sample.Class.Student;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerDownloadDocument implements Initializable {
    @FXML
    WebView web;
    private Student student;

    public static String link;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        WebEngine engine = web.getEngine();
        engine.load(link);
    }

    public void logout(ActionEvent event) throws IOException {
        setSceneLogin(event);
        student = null;
    }

    public void setSceneLogin(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../Fxml/loginDemo.fxml"));
        Stage primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        primaryStage.setTitle("Hust English App");
        Scene scene = new Scene(root, 700, 500);
        //  scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());

        Image image = new Image(getClass().getResourceAsStream("../book.png"));
        primaryStage.getIcons().add(image);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void setSceneDocument(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../Fxml/document.fxml"));
        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root,1083,690);
        window.getIcons().add(new Image(getClass().getResourceAsStream("../book.png")));
        window.setTitle("Hust English App");
        window.setScene(scene);
        window.show();
    }

    public void undo(ActionEvent event) throws IOException {
        setSceneDocument(event);
    }
}
