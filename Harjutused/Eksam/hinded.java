package Harjutused.Eksam;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by anni-bessie on 2.02.17.
 */
public class hinded {

    public static void main(String[] args) {

        hindestatistika hinded = new hindestatistika();
        hinded.sisestatudnimi();
        hinded.sisestatudhinne();
        hinded.positiivsedhinded();
        hinded.eksamiraskus();

        hinded.parimtulemus();

    }
}



