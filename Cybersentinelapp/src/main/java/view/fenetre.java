package view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.incident;

import java.util.ArrayList;
import java.util.List;

public class fenetre extends Application {
    private ListView<incident> lesIncident = new ListView<>();


    @Override
    public void start(Stage stage) throws Exception {
        ListView<incident> incidents = new ListView<>();
        incident incident1 = new incident("Homme du milieux","192.168.6.1",4);
        incidents.getItems().addAll(incident1);
        Label label = new Label("Liste d'incident");
        VBox root = new VBox(5);
        root.setPadding((new Insets(10)));
        root.getChildren().addAll(
                label,
                incidents
        );
        Scene scene = new Scene(root,400,600);
        stage.setScene(scene);
        stage.setTitle("CyberSentinel");
        stage.show();
    }

    public static void Main(String [] args){
        launch();
    }
}
