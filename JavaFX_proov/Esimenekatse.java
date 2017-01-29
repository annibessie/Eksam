package JavaFX_proov;
import javafx. application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by anni-bessie on 25.10.16.
 */
public class Esimenekatse extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vbox = new VBox();
        Scene login = new Scene (vbox, 300, 150);
        primaryStage.setScene(login);

        primaryStage.show();

        Label pealkiri = new Label ("Mis on parool?");
        TextField paroolField = new TextField();
        Button submitbutton = new Button("Login");

        vbox.getChildren().addAll(pealkiri, paroolField, submitbutton);
        Circle ring = new Circle(50);
        Pane pane = new Pane();
        pane.getChildren().add(ring);
        Scene seesstseen = new Scene(pane, 600, 500);

        submitbutton.setOnAction(event -> {
               String parool = paroolField.getText();
            if (parool. equals("Minusupersalajanepass")) {
                System.out.println("Pass on õige");
                primaryStage.setScene(seesstseen);
            } else {
                System.out.println("Pass on vale!");
            }
        });
    }
}
