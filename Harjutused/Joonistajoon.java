package Harjutused;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Created by anni-bessie on 28.01.17.
 */
public class Joonistajoon extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage stage = new Stage();
        VBox vbox = new VBox();
        vbox.setSpacing(2);
        Scene scene = new Scene(vbox, 500, 500);
        stage.setScene(scene);

        Label algusx = new Label();
        algusx.setText("Sisesta joone algus ja lõpu koordinaadid");

        TextField algusxx = new TextField();
        algusxx.setPromptText("Alguspunkti x-koordinaat");
        String algusxkoht = algusxx.getText();
        int xalgus = Integer.parseInt(algusxkoht);
        double x = (double) xalgus;
        //kas ma võin siin teha double'iks, et järgmises stseenis seda kasutada?
        System.out.println(xalgus);

        TextField algusyy = new TextField();
        algusyy.setPromptText("Alguspunkti y-koordinaat");
        String algusykoht = algusyy.getText();

        TextField loppxx = new TextField();
        loppxx.setPromptText("Lõpppunkti x-koordinaat");
        String loppxkoht = loppxx.getText();

        TextField loppyy = new TextField();
        loppyy.setPromptText("Lõpppunkti y-koordinaat");
        String loppykoht = loppyy.getText();

        Button sisesta = new Button("Joonista mulle joon!");
        Pane pane = new Pane();
        Scene tulemus = new Scene(pane, 500, 500);

        sisesta.setOnMouseClicked(event -> {
            Line joon = new Line();
            joon.setFill(Color.BLACK);
            joon.setStartX(x);


            stage.setScene(tulemus);

        });
        vbox.getChildren().addAll(algusx, algusxx, algusyy, loppxx, loppyy, sisesta);
        stage.show();
    }

}
