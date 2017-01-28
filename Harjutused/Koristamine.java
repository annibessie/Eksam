package Harjutused;

/**
 * Created by anni-bessie on 28.01.17.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Loo JavaFXis koristaja mäng.
 * 1. Ekraan (näiteks 500x500) on paksult ringe täis. Nii, et läbi ei näe.
 * 2. Ringile hiirega vastu minnes kaob ring ära.
 * 3. Ringide all on peidus sõnum (näiteks Labeliga), mida kasutaja lõpuks näeb.
 */
public class Koristamine extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 500, 500);
        primaryStage.setScene(scene);
        Text teade = new Text ("Päris puhas juba - hea töö!");
        primaryStage.show();
        stack.getChildren().add(teade);

        for (int i = 0; i < 1000; i++) {
            Circle ring = new Circle(30);
            ring.setFill(Color.GREY);
            ring.setTranslateX( -500 + Math.random()*1500);
            ring.setTranslateY(-500 + Math.random()*1500);
            stack.getChildren().addAll(ring);
            primaryStage.show();

            ring.setOnMouseEntered(event -> {
                ring.setFill(Color.TRANSPARENT);
                primaryStage.show();
            });

        }

    }
}
