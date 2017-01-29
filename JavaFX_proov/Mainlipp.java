package JavaFX_proov;
import javafx. application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Created by anni-bessie on 25.10.16.
 */
public class Mainlipp extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene stseen = new Scene(pane, 600, 600);

        primaryStage.setScene(stseen);
        primaryStage.show();

        Rectangle esiristkylik = new Rectangle(20, 20, 200, 50);
        esiristkylik.setFill(Color.BLUE);
        esiristkylik.setStroke(Color.BLACK);
        Rectangle teineristkylik = new Rectangle(20, 70, 200, 50);
        teineristkylik.setFill(Color.BLACK);
        teineristkylik.setStroke(Color.BLACK);
        Rectangle kolmasristkylik = new Rectangle(20, 120, 200, 50);
        kolmasristkylik.setFill(Color.WHITE);
        kolmasristkylik.setStroke(Color.BLACK);

        pane.getChildren().addAll(esiristkylik, teineristkylik, kolmasristkylik);


        Rectangle ristkylik = new Rectangle(20, 250, 300, 100);
        ristkylik.setStroke(Color.BLACK);
        ristkylik.setFill(Color.WHITE);

        Circle ring = new Circle(30);
        ring.setCenterX(150);
        ring.setCenterY(250);
        ring.setFill(Color.RED);
        pane.getChildren().addAll(ring, ristkylik);

    }
}
