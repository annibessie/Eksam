package Harjutused;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Joonista ekraanile hunnik ristkülikuid, suvalistel positsioonidel. Ühe korra kastile klikates
 * muutub ta 2x väiksemaks. Teist korda klikates kaob ta sootuks.
 */
public class PixelChaser extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);

        for (int i = 0; i< 10; i++){
            Rectangle rect = new Rectangle(i*10, i*100, 100, 100);
            pane.getChildren().addAll(rect);
            rect.setId("eioleklikitud");
            boolean clicked = false;
            rect.setOnMouseClicked( event -> {
                if (clicked) {
                    rect.setScaleX(0);
                    rect.setScaleY(0);
                } else {
                    rect.setScaleX(0.5);
                    rect.setScaleY(0.5);

                }
                rect.setId("Klikitud");
            });
        }

    }
}
