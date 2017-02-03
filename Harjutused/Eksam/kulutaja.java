package Harjutused.Eksam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by anni-bessie on 3.02.17.
 */
public class kulutaja {
    String kulunimi;
    int palk;
    int kulu;
    String kulumaha;
    int suurimaindeks;


    ArrayList kulunimed = new ArrayList();
    ArrayList <Integer> kulusuurused = new ArrayList<>();

    public void palk (){
        Scanner input = new Scanner(System.in);

        System.out.println("Palk: ");
        palk = Integer.parseInt(input.next());

    }

    public void kulunimi (){
        for (int i = 0; i < 5; i++) {
            Scanner input = new Scanner(System.in);

            System.out.println("Kululiik: ");
            kulunimi = input.next();
            kulunimed.add(kulunimi);
        }
    }


    public void kulusuurus (){
        for (int i = 0; i < 5 ; i++) {

            Scanner input = new Scanner(System.in);

            System.out.println("Kulu suurus: ");
            kulu = Integer.parseInt(input.next());
            kulusuurused.add(kulu);
        }
    }

    int l = 0;
    double rahaalles = palk;

    public void raha () {
        while (l < kulusuurused.size()) {
        rahaalles = rahaalles - kulusuurused.get(l);
            l++;
            System.out.println(rahaalles);
        }
        System.out.println("Raha jäi alles: " + (palk + rahaalles) + " eurot.");

        if (palk + rahaalles < 0) {
            System.out.println("Sul ei ole kõikideks kulutusteks piisavalt raha.");
            Scanner input = new Scanner(System.in);

            System.out.println("Millist kulutust soovid maha võtta: ");
            kulumaha = input.next();
            kulunimed.remove(kulumaha);

        }
        System.out.println("Allesjäänud kulutused on: " + kulunimed + " .");
    }


    public void suurimkulu () {
        Integer suurim = Collections.max(kulusuurused);
        System.out.println("Suurim kulu oli: " + suurim + "eurot.");
        suurimaindeks = kulusuurused.indexOf(suurim);
        System.out.println("Suurim kuluallikas: " + kulunimed.get(suurimaindeks));

    }

}
