package Harjutused;

import java.util.ArrayList;

/**
 * Created by anni-bessie on 28.01.17.
 */
/**
 * Antud on kaks massiivi õhu temperatuuridega. Arvuta mõlema puhul mitu positiivset temperatuuri
 * on massiivis rohkem kui negatiivseid.
 */
public class Miinuskraadid {

    public static void main(String[] args) {
        int[] kraadid1 = {11, 10, 5, 1, 3, -2, -6, 2, -13, -24, -9, 0};
        int[] kraadid2 = {-23, -25, -22, -18, -15, -19, -13};

        ArrayList<Integer> esimesepositiivsed = new ArrayList();

        ArrayList<Integer> esimesenegatiivsed = new ArrayList();

        double esimeseposkraadid = 0;
        for (int i=0; i < kraadid1.length; i++) {
            if (kraadid1[i] > 0) {
                esimeseposkraadid ++;
            }
            //System.out.println(esimeseposkraadid);
        }

        double esimesenegkraadid = 0;
        int i;
        for (i = 0; i < kraadid1.length; i++){
            if (kraadid1[i] <= 0){
                esimesenegkraadid ++;
            }
            //System.out.println(esimesenegkraadid);
        }
        double vastus = 0;
        vastus = esimeseposkraadid - esimesenegkraadid;
        System.out.println("Esimeses massiivis on positiivseid kraade rohkem: " + vastus + " võrra");

        double teiseposkraadid = 0;
        int z;
        for (z = 0; z < kraadid2.length; z++) {
            if (kraadid2[z] > 0) {
                teiseposkraadid ++;
            }
            //System.out.println(esimeseposkraadid);
        }

        double teisenegkraadid = 0;
        for (z = 0; z < kraadid2.length; z++){
            if (kraadid2[z] <= 0){
                teisenegkraadid ++;
            }
            //System.out.println(esimesenegkraadid);
        }
        double vastus2 = 0;
        vastus = teiseposkraadid - teisenegkraadid;

        if (vastus < 0) {
            System.out.println("Massiivis on negatiivseid rohkem kui positiivseid!");
        } else {
            System.out.println("Teises massiivis on positiivseid kraade rohkem" + vastus2);
        }

    }
}
