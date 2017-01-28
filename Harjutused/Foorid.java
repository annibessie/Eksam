package Harjutused;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
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

            Circle ringnahtamatu1 = new Circle(30);
            ringnahtamatu1.setTranslateY(10);
            ringnahtamatu1.setTranslateX(20);
            ringnahtamatu1.setFill(Color.RED);

            Circle ringnahtamatu2 = new Circle (30);
            ringnahtamatu2.setTranslateY(50);
            ringnahtamatu2.setTranslateX(100);
            ringnahtamatu2.setFill(Color.RED);

            Circle ringnahtamatu3 = new Circle (30);
            ringnahtamatu3.setTranslateY(150);
            ringnahtamatu3.setTranslateX(50);
            ringnahtamatu3.setFill(Color.RED);
            stack.getChildren().addAll(ringnahtamatu1, ringnahtamatu2, ringnahtamatu3);

            primaryStage.show();

            ringnahtamatu1.setOnMouseEntered(event -> {
                ringnahtamatu1.setFill(Color.GREEN);
                primaryStage.show();
            });
            ringnahtamatu2.setOnMouseEntered(event -> {
                ringnahtamatu2.setFill(Color.GREEN);
                primaryStage.show();
            });

            ringnahtamatu3.setOnMouseEntered(event -> {
                ringnahtamatu3.setFill(Color.GREEN);
                primaryStage.show();
            });
        }
}

