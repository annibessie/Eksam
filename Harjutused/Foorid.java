package Harjutused;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Created by anni-bessie on 28.01.17.
 */
/**
 * Joonista 500x500 ekraanile hunnikuga punaseid ringe.
 * Kui hiir ringile vastu läheb, muutub ring roheliseks.
 * Kordan - ring muudab värvi juba hiire puudutusest, mitte klikist.
 */
public class Foorid extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception {
            StackPane stack = new StackPane();
            Scene scene = new Scene(stack, 500, 500);
            primaryStage.setScene(scene);

            for (int i = 0; i< 50; i++) {
                Circle punanering = new Circle(30);
                punanering.setFill(Color.RED);
                punanering.setTranslateX(Math.random()*200);
                punanering.setTranslateY(Math.random()*200);
                stack.getChildren().addAll(punanering);

                primaryStage.show();

                punanering.setOnMouseEntered(event -> {
                punanering.setFill(Color.GREEN);
                primaryStage.show();
                });
            }
        }
}

