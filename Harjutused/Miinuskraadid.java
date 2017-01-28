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
                esimesepositiivsed.add(kraadid1[i]);
            }
            System.out.println(esimesepositiivsed);
        }

        double esimesenegkraadid = 0;
        int i;
        for (i = 0; i < kraadid1.length; i++){
            if (kraadid1[i] <= 0){
                esimesenegatiivsed.add(kraadid1[i]);
            }
            System.out.println(esimesenegatiivsed);
        }

        double vastus1 = 0;
        vastus1 = esimesepositiivsed.size()- esimesenegatiivsed.size();
        System.out.println(vastus1);
    }
}
