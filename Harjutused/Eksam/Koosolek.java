package Harjutused.Eksam;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by anni-bessie on 30.01.17.
 */
public class Koosolek {


    public static void main (String [] args){

        koosolekuinfo koosolek = new koosolekuinfo();

        koosolek.sisestatudnimi();
        koosolek.lisatudTeema();
        koosolek.planeeritudaeg();
        koosolek.lisaTeemad();

        koosolek.prindikoikteemad();
        koosolek.sisestalabitudteema();
        koosolek.labitudTeema ();


        koosolek.kulutatudaeg();


        koosolek.ajakulu();

    }
}
