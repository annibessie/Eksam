package Harjutused;

/**
 * Created by anni-bessie on 28.01.17.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Joonista ekraanile hunnik ristkülikuid, suvalistel positsioonidel. Ühe korra kastile klikates
 * muutub ta 2x väiksemaks. Teist korda klikates kaob ta sootuks.
 */
public class Pixelchase extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);

        for (int i = 0; i < 30; i++) {
            Rectangle ristkylik = new Rectangle(Math.random()*200, Math.random()*200 , 30, 50);
            //stack.getChildren().addAll(ristkylik);

            ristkylik.setOnMouseClicked( event -> {
                System.out.println(ristkylik.getHeight());
                if (ristkylik.getHeight() == 50) {
                    ristkylik.setHeight(ristkylik.getHeight() / 2);
                    ristkylik.setWidth(ristkylik.getWidth() / 2);
                } else {ristkylik.setVisible(false);}
            });
            pane.getChildren().addAll(ristkylik);
        }
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}

