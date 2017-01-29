package Harjutused.OOPyl;

import java.util.ArrayList;

/**
 * Created by anni-bessie on 28.01.17.
 */
public class Korter1 {

    int mahutavus;
    ArrayList kylalised = new ArrayList();

    public Korter1(int mahutab) {

        this.mahutavus = mahutab;

    }

    public void saabus(String kylaline) {
        if (kylalised.size() < 10) {
            kylalised.add(kylaline);
        } else {
            System.out.println("Sa ei mahu, mine koju!");

        }

    }

    public void prindiKylalisteArv() {
        System.out.println("Peol on " + kylalised.size() + "külalist.");

    }

    public void prindiPaljuVeelMahub() {
        System.out.println("Veel mahub " + (mahutavus -kylalised.size()) + "külalist" );
    }

    public void lahkus(String lahkuja) {
        for (int i = 0; i < kylalised.size() ; i++) {
            if (kylalised.get(i).equals(lahkuja)){
                kylalised.remove(lahkuja);
            }
            
        }
       // kylalised.remove(kylaline);

    }
}
