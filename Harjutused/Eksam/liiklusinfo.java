package Harjutused.Eksam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by anni-bessie on 2.02.17.
 */
public class liiklusinfo {
    String autosuund;
    String Kesklinn;
    String Mustamäe;
    String Tabasalu;
    String Paldiski;



    ArrayList autosuunad = new ArrayList();
    ArrayList kesklinna = new ArrayList();
    ArrayList mustakale = new ArrayList();
    ArrayList tabasallu = new ArrayList();
    ArrayList paldiskisse = new ArrayList();

    public void autosuund (){
        for (int i = 0; i < 5; i++) {
            Scanner input = new Scanner(System.in);

            System.out.println("Kuhu suunda auto sõitis? Sisesta asukoha esimene täht - Kesklinn, Mustamäe, Tabasalu või Paldiski");
            autosuund = input.next();
        }

    }

    public void lisasuunad (){
        autosuunad.add(autosuund);
    }

    public void autosuunad () {
        for (int i = 0; i < 5 ; i++) {
            if (autosuunad.get(i).equals(Kesklinn)){
                kesklinna.add (autosuunad);
            }
            else if (autosuunad.get(i).equals(Mustamäe)){
                mustakale.add(autosuunad);
            }
            else if (autosuunad.get(i).equals(Tabasalu)) {
                tabasallu.add(autosuunad);
            }
            else if (autosuunad.get(i).equals(Paldiski)){
                paldiskisse.add (autosuunad.get(i));
            }
        }
    }

    public void liiklussagedus () {
        System.out.println("Kesklinna sõitis: " + kesklinna.size() + " autot.");
        System.out.println("Mustamäele sõitis: " + mustakale.size() + " autot.");
        System.out.println("Tabasaluu sõitis: " + tabasallu.size() + " autot.");
        System.out.println("Paldiskisse sõitis: " + paldiskisse.size() + " autot.");
    }

    public void poppsuund () {

    }


}
