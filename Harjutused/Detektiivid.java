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
 * Tee JavaFXiga detektiivi mäng, kus kasutaja saab nähtamatuid ringe otsida.
 * 1. Ekraanil (näiteks 500x500) on suvalistes kohtades 3 ringi, mida näha ei ole.
 * 2. Hiirega ringile vastu minnes tuleb ring nähtavale.
 */
public class Detektiivid extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception {
            StackPane stack = new StackPane();
            Scene scene = new Scene(stack, 500, 500);
            primaryStage.setScene(scene);

            Circle ringnahtamatu1 = new Circle(30);
            ringnahtamatu1.setTranslateY(10);
            ringnahtamatu1.setTranslateX(20);
            ringnahtamatu1.setFill(Color.WHITE);

            Circle ringnahtamatu2 = new Circle (30);
            ringnahtamatu2.setTranslateY(50);
            ringnahtamatu2.setTranslateX(100);
            ringnahtamatu2.setFill(Color.WHITE);

            Circle ringnahtamatu3 = new Circle (30);
            ringnahtamatu3.setTranslateY(150);
            ringnahtamatu3.setTranslateX(50);
            ringnahtamatu3.setFill(Color.WHITE);
            stack.getChildren().addAll(ringnahtamatu1, ringnahtamatu2, ringnahtamatu3);

            primaryStage.show();

            ringnahtamatu1.setOnMouseEntered(event -> {
                ringnahtamatu1.setFill(Color.BLACK);
                primaryStage.show();
            });
            ringnahtamatu2.setOnMouseEntered(event -> {
                ringnahtamatu2.setFill(Color.BLACK);
                primaryStage.show();
            });

            ringnahtamatu3.setOnMouseEntered(event -> {
                ringnahtamatu3.setFill(Color.BLACK);
                primaryStage.show();
            });

        }
}
