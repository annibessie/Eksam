package Harjutused;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Created by anni-bessie on 28.01.17.
 */
public class Joonistajoon extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);

        Label algusx = new Label("Sisesta joone algus ja lõpu koordinaadid");
        TextField algusxx = new TextField("Alguspunkti x-koordinaat");
        TextField algusyy = new TextField("Alguspunkti y-koordinaat");
        TextField loppxx = new TextField("Lõpppunkti x-koordinaat");
        TextField loppyy = new TextField("Lõpppunkti y-koordinaat");
        Button sisesta = new Button("Joonista mulle joon!");

        algusxx.setTranslateY(50);
        algusyy.setTranslateY(100);
        loppxx.setTranslateY(150);
        loppyy.setTranslateY(200);
        sisesta.setTranslateY(250);


        sisesta.setOnAction(event -> {
            Line joon = new Line();
            double xalgus = Integer.parseInt(algusxx.getText());
            double yalgus = Integer.parseInt(algusyy.getText());
            double xlopp = Integer.parseInt(loppxx.getText());
            double ylopp = Integer.parseInt(loppyy.getText());

            joon.setFill(Color.BLACK);
            joon.setStartX(xalgus);
            joon.setStartY(yalgus);
            joon.setEndX(xlopp);
            joon.setEndY(ylopp);
            pane.getChildren().removeAll(algusx, algusxx, algusyy, loppxx, loppyy, sisesta);
            pane.getChildren().add(joon);
        });

        pane.getChildren().addAll(algusx, algusxx, algusyy, loppxx, loppyy, sisesta);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}



