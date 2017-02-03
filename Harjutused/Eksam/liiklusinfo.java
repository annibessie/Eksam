package Harjutused.Eksam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by anni-bessie on 2.02.17.
 */
public class liiklusinfo {
    int autosuund;


    ArrayList <Integer> autosuunad = new ArrayList();
    ArrayList kesklinna = new ArrayList();
    ArrayList mustakale = new ArrayList();
    ArrayList tabasallu = new ArrayList();
    ArrayList paldiskisse = new ArrayList();

    public void autosuund (){
        for (int i = 0; i < 5; i++) {
            Scanner input = new Scanner(System.in);

            System.out.println("Kuhu suunda auto sõitis? Sisesta asukoha esimene täht - Kesklinn = 1, Mustamäe = 2, Tabasalu = 3 või Paldiski = 4");
            autosuund = Integer.parseInt(input.next());
            autosuunad.add(autosuund);
        }

        System.out.println(autosuunad.size());

    }


    public void autosuunad () {
        for (int i = 0; i < 5 ; i++) {
            if (autosuunad.get(i) == 1) {
                kesklinna.add(autosuunad.get(i));
                System.out.println(kesklinna);

            } else if (autosuunad.get(i) == 2) {
                mustakale.add(autosuunad.get(i));

            } else if (autosuunad.get(i) == 3) {
                tabasallu.add(autosuunad.get(i));

            } else if (autosuunad.get(i) == 4) {
                paldiskisse.add(autosuunad.get(i));
            }
        }
    }


    public void liiklussagedus () {
        System.out.println("Kesklinna sõitis: " + kesklinna.size() + " autot.");
        System.out.println("Mustamäele sõitis: " + mustakale.size() + " autot.");
        System.out.println("Tabasallu sõitis: " + tabasallu.size() + " autot.");
        System.out.println("Paldiskisse sõitis: " + paldiskisse.size() + " autot.");
    }

    public void poppsuund () {

    }


}
