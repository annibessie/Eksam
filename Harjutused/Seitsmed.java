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

            ArrayList<Integer> korrutakahega = new ArrayList<>();

            for (int i = 0; i < naide.length; i++){
                if (naide [i] ==7) {
                    int seitsekorrutakahega = naide[i] * 2;
                    korrutakahega.add(seitsekorrutakahega);
                }
                else {
                    korrutakahega.add(naide[i]);
                }
            }
            System.out.println(korrutakahega);

            int l = 0;
            double summa = 0;

            while (l < korrutakahega.size()){
                summa = summa + korrutakahega.get(l);
                l++;
            }
            System.out.println(summa);

            double keskmine = summa/korrutakahega.size();
            System.out.println(keskmine);
        }
}

