package Harjutused;

/**
 * Created by anni-bessie on 28.01.17.
 */
/**
 * Antud on massiiv. Mitu sõne on massiivis keskmisest pikemad?
 */
public class Pikksone {

    public static void main (String [] args) {
        String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"};

        double summa = 0;
        for (int i = 0; i < naide.length ; i++) {
            summa = summa + naide[i].length();
        }
        double keskmine = summa / naide.length;
        System.out.println(summa);
        System.out.println(keskmine);

        double pikemad = 0;
        for (int i = 0; i <naide.length ; i++) {
            if (naide[i].length() > keskmine){
                pikemad ++;
            }

        }
        System.out.println(pikemad);
    }

}
