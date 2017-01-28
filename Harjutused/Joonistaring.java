package Harjutused;

/**
 * Created by anni-bessie on 28.01.17.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt x, y kordinaadid ja raadius ning joonista talle ring.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Joonistaring extends Application{

    @Override
    public void start (Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene =  new Scene(pane, 500, 500);

        Label algus = new Label ("Sisesta ringi x ja y koordinaadid ning raadius");
        TextField x = new TextField("X-koordinaat");
        TextField y = new TextField("Y-koordinaat");
        TextField r = new TextField("Raadius");
        Button sisesta = new Button("Joonista mulle ring!");

        x.setTranslateY(50);
        y.setTranslateY(100);
        r.setTranslateY(150);
        sisesta.setTranslateY(200);

        sisesta.setOnAction(event -> {
            Circle ring = new Circle ();
            double xring = Integer.parseInt(x.getText());
            double yring = Integer.parseInt(y.getText());
            double rring = Integer.parseInt(r.getText());

            ring.setFill(Color.RED);
            ring.setTranslateX(xring);
            ring.setTranslateY(yring);
            ring.setRadius(rring);
            pane.getChildren().removeAll(algus, x, y, r, sisesta);
            pane.getChildren().add(ring);
        });

        pane.getChildren().addAll(algus, x, y, r, sisesta);
        primaryStage.setScene(scene);
        primaryStage.show();


    }


}
