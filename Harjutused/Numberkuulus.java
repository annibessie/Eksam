package Harjutused;

import java.util.*;

/**
 * Created by anni-bessie on 28.01.17.
 */
/**
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */
public class Numberkuulus {


    public static void main(String[] args) {

        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7
        System.out.println(Arrays.toString(naide));

        ArrayList<Integer> kolmmaha = new ArrayList<>();


        for (int i = 0; i < naide.length; i++) {
            if (naide[i] != 3) {
                kolmmaha.add(naide[i]);
            }
        }
        System.out.println(kolmmaha);

        int popp = 0;
        for (int i : kolmmaha) {
            int sagedus = Collections.frequency(kolmmaha, i);
            System.out.println(sagedus);
        }

        System.out.println("Kõige rohkem esineb number:" + kolmmaha.get(4) + ", sest neid on 2");
    }
}

