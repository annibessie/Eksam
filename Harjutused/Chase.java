package Harjutused;

/**
 * Created by anni-bessie on 28.01.17.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista 500x500 ekraanile ring. Kui hiir ringile vastu läheb, leiab ring omale
 * uue koha. Ei pea animeerima ega midagi fäänsit. Lihtsalt ilmub uues kohas ja kõik.
 * Ehk hiirega saab ringi taga ajada. Kordan - ring leiab uue koha juba hiire puudutusest,
 * mitte klikist. Aga alustada võid muidugi klikist.
 */

public class Chase extends Application{

        @Override
        public void start(Stage primaryStage) throws Exception {

            StackPane stack = new StackPane();
            Scene scene = new Scene(stack, 500, 500);
            primaryStage.setScene(scene);

            Circle ring = new Circle(30);
            ring.setCenterX(100);
            ring.setCenterY(100);
            ring.setFill(Color.BLACK);
            stack.getChildren().addAll(ring);

            primaryStage.show();

            ring.setOnMouseEntered(event -> {
                ring.setFill(Color.BLACK);
                double x = (double) Math.random() * 100;
                double y = (double) Math.random() * 100;
                ring.setTranslateX(x);
                ring.setTranslateY(y);
                primaryStage.show();
            });
        }
}
