package Harjutused.OOPyl;

import java.util.ArrayList;

/**
 * Created by anni-bessie on 28.01.17.
 */
public class Kassa1 {


    String pidaja;
    ArrayList <String> kaubad = new ArrayList<>();
    public Kassa1 (String kassapidaja) {
        this. pidaja = kassapidaja;
        //pidaja = kassapidaja
    }

    public void lisaToode(String toode) {
        kaubad.add(toode);
    }

    public void eemaldaToode(String eemalda) {
        for (int i = 0; i < kaubad.size() ; i++) {
            if (kaubad.get(i).equals(eemalda)){
                kaubad.remove(i);
            }
        }
    }

    public void prindiOstutsekk() {
        for (int i = 0; i < kaubad.size(); i++) {
            System.out.println(kaubad.get(i));
        }
    }

    public void prindiKassapidajaNimi() {
        System.out.println(pidaja);

    }
}

