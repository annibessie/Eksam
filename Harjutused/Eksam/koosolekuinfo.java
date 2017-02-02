package Harjutused.Eksam;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by anni-bessie on 30.01.17.
 */
public class koosolekuinfo {
    int kulutatudaeg;
    int planeeritudaeg;
    String sisestatudnimi;
    String lisatudTeema1;
    String lisatudTeema2;
    int teemadearv;

    ArrayList<String> teemad = new ArrayList(5);


    public void sisestatudnimi () {
        Scanner input = new Scanner(System.in);

        System.out.println("Nimi: ");
        sisestatudnimi= input.next();
    }


    public void lisatudTeema () {
        Scanner input = new Scanner(System.in);

        System.out.println("Sisesta esimene teema, millest soovid koosolekul rääkida: ");
        lisatudTeema1 = input.next();

        System.out.println("Sisesta teine teema, millest soovid koosolekul rääkida: ");
        lisatudTeema2 = input.next();

    }


    public void lisaTeemad() {
        teemad.add (lisatudTeema1);
        teemad.add(lisatudTeema2);
    }


    public void prindikoikteemad() {
        for (int i = 0; i < teemad.size() ; i++) {
            System.out.println(sisestatudnimi + " soovib koosolekul keskenduda teemadele: " + teemad.get(i));
        }
        System.out.println();
    }


    public void sisestalabitudteema () {
        Scanner input = new Scanner(System.in);

        System.out.println("Mitmel soovitud teemal jõudsid koosolekul rääkida? ");
        teemadearv = input.nextInt();
    }

    public void planeeritudaeg () {
        Scanner input = new Scanner(System.in);

        System.out.println("Mitu tundi sul oleks vaja nende teemade arutamiseks? ");
        planeeritudaeg = input.nextInt();
    }

    public void labitudTeema() {
        if (teemadearv < 2){
            System.out.println("Töötaja " + sisestatudnimi + " ei jõudnud kõiki soovitud teemasid läbida.");
        } else {
            System.out.println("Jõudsin ilusti eesmärgiks seatud teemad läbida. Tubli!");
        }

    }


    public void kulutatudaeg() {

        Scanner input = new Scanner(System.in);

        System.out.println("Mitu tundi teema/teemade arutamiseks reaalselt kulus? ");
        kulutatudaeg = input.nextInt();
    }


    public void ajakulu() {

        if (kulutatudaeg <= planeeritudaeg && teemadearv == 2) {
            System.out.println(" Oled ka ajaliselt graafikus:)");
        }
        else if (kulutatudaeg > planeeritudaeg && teemadearv == 2) {
        System.out.println("Oled küll teemadega graafikus, kuid ajaliselt on sul hetkel kulunud rohkem aega kui planeerisid: " + (planeeritudaeg-kulutatudaeg) + " tundi.");
        }
        else if (kulutatudaeg < planeeritudaeg && teemadearv == 1){
            System.out.println("Sa ei läinud küll ajast üle, kuid sa jõudsid selle ajaga vaid ühe planeeritud teemadest läbida . Fokusseri ja planeeri rohkem!");
        }
        else if (kulutatudaeg > planeeritudaeg && teemadearv == 1){
            System.out.println("Sa läksid ajast üle ja jõudsid selle ajaga vaid ühe planeeritud teemadest läbida . Fokusseri ja planeeri rohkem!");
        }
        else if (kulutatudaeg > planeeritudaeg && teemadearv < 0){
            System.out.println("Kahjuks ei jõudnud sa kumbagi teemat läbida ning ka ajast jäi puudu. Soovitav minna ajajuhtimise koolitusele.");

            }
    }

}
