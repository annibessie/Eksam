package Harjutused;

import java.util.ArrayList;

/**
 * Created by anni-bessie on 28.01.17.
 */
/**
 * Antud on int[] massiiv. Korruta kõik seitsmed kahega ja leia arvude keskmine.
 */
public class Seitsmed {

        public static void main(String[] args) {

            int[] naide = {7, 4, 324, 65, 4, 78, 7, 45, 4};

            ArrayList<Integer> kahegakorrutatud = new ArrayList<>();

            for (int i = 0; i <naide.length ; i++) {
                if (naide[i] == 7){
                    kahegakorrutatud.add(naide[i]*2);
                } else {
                    kahegakorrutatud.add(naide[i]);
                }
            }
            System.out.println(kahegakorrutatud);

            int l = 0;
            double summa = 0;

            while (l < kahegakorrutatud.size()){
                summa = summa + kahegakorrutatud.get(l);
                l++;
            }

            System.out.println(summa);

            double keskmine = summa / kahegakorrutatud.size();

            System.out.println(keskmine);

        }
}

