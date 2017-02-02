package Harjutused.Eksam;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by anni-bessie on 2.02.17.
 */
public class hindestatistika {
    String sisestatudnimi;
    int sisestatudhinne;
    int parim = 0;

    ArrayList nimed = new ArrayList();
    ArrayList <Integer> hinded = new ArrayList<>();
    ArrayList poshinded = new ArrayList();



    public void sisestatudnimi () {

        for (int i = 0; i < 6; i++) {
            Scanner input = new Scanner(System.in);

            System.out.println("Nimi: ");
            sisestatudnimi= input.next();
        }
    }

    public void sisestatudhinne () {
        for (int i = 0; i < 6; i++) {
            Scanner input = new Scanner(System.in);

            System.out.println("Hinne: ");
            sisestatudhinne = Integer.parseInt(input.next());
            hinded.add(sisestatudhinne);

        }
        System.out.println("Kokku on hindeid: " + hinded.size());
    }


    public void positiivsedhinded () {
        for (int i = 0; i < 6; i++) {
            if (hinded.get(i) > 1){
                poshinded.add(hinded.get(i));
            }
        }
        System.out.println("Eksami läbisid " + poshinded.size() + " õpilast.");

    }

    public void eksamiraskus () {
        if ((poshinded.size() * 100) / hinded.size() >= 70) {
            System.out.println("Eksami raksusaste oli sobiv.");
        } else {
            System.out.println("Eksam oli liiga raske.");

        }

    }

    public void parimtulemus () {
            Integer parim = Collections.max(hinded);
            System.out.println("Parima hinde said õpilased, kes said hinde: " + parim);

    }

}
