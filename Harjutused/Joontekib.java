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

import static javax.swing.UIManager.getInt;

/**
 * Created by anni-bessie on 28.01.17.
 */
/**
 * Küsi kasutajalt alguse ja lõpu x-y kordinaadid ning joonista talle joon.
 * Akna võime limiteerida 500x500 piksli peale.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Joontekib extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //VBox vbox = new VBox();
        //Scene avaleht = new Scene();
        //Stage stage = new Stage();


        VBox vbox = new VBox();
        Scene avaleht = new Scene(vbox, 500, 500);
        vbox.setSpacing(2);
        Stage stage = new Stage();
        stage.setScene(avaleht);
        stage.show();

        Label algusx = new Label();
        algusx.setText("Sisesta joone algus ja lõpu koordinaadid");

        TextField algusxx = new TextField();
        algusxx.setPromptText("Alguspunkti x-koordinaat");
        String algusxkoht = algusxx.getText();
        int xalgus = Integer.parseInt(algusxkoht);
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

        //System.out.println(algusxkoht);


        sisesta.setOnMouseClicked(event -> {
            stage.setScene(tulemus);
            Line joon = new Line();
            joon.setFill(Color.BLACK);
            joon.setStartX(getInt(algusxkoht));
            joon.setStartY(getInt(algusykoht));
            joon.setEndX(getInt(loppxkoht));
            joon.setEndY(getInt(loppykoht));

        });

        vbox.getChildren().addAll(algusx, algusxx, algusyy, loppxx, loppyy, sisesta);

    }
}

