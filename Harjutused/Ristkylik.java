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
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguskordinaadid ja laius-kõrgus ning joonista talle ristkülik.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Ristkylik extends Application{

    @Override
    public void start (Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);

        Label algus = new Label("Sisesta ristküliku alguskoordinaadid ja laius ning kõrgus");
        TextField x = new TextField("Alguspunkti x-koordinaat");
        TextField y = new TextField("Alguspunkti y-koordinaat");
        TextField l = new TextField("Ristküliku laius");
        TextField p = new TextField("Ristküliku pikkus");
        Button sisesta = new Button("Joonista mulle ristkülik!");

        x.setTranslateY(50);
        y.setTranslateY(100);
        l.setTranslateY(150);
        p.setTranslateY(200);
        sisesta.setTranslateY(250);

        sisesta.setOnAction(event -> {
            Rectangle rist = new Rectangle ();
            double xrist = Integer.parseInt(x.getText());
            double yrist = Integer.parseInt(y.getText());
            double laius = Integer.parseInt(l.getText());
            double pikkus = Integer.parseInt(p.getText());

            rist.setFill(Color.GREEN);
            rist.setX(xrist);
            rist.setY(yrist);
            rist.setWidth(laius);
            rist.setHeight(pikkus);
            pane.getChildren().removeAll(algus, x, y, l, p, sisesta);
            pane.getChildren().add(rist);
        });

        pane.getChildren().addAll(algus, x, y, l, p, sisesta);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
