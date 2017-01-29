package Harjutused;

/**
 * Created by anni-bessie on 28.01.17.
 */

import javafx.application.Application;
import javafx.scene.Scene;
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
        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 500, 500);
        primaryStage.setScene(scene);

        for (int i = 0; i < 10; i++) {
            Rectangle ristkylik = new Rectangle(-500 + Math.random()*1500,-500 + Math.random()*1500 , 30, 50);
            stack.getChildren().addAll(ristkylik);

            primaryStage.show();

            ristkylik.setOnMouseClicked( event -> {
                System.out.println(ristkylik.getHeight());
                if (ristkylik.getHeight() == 50) {
                    ristkylik.setHeight(ristkylik.getHeight() / 2);
                    ristkylik.setWidth(ristkylik.getWidth() / 2);
                } else {
                    ristkylik.setVisible(false);
                }
                stack.getChildren().addAll(ristkylik);
                primaryStage.setScene(scene);
                primaryStage.show();
            });

        }

    }

}

