package Harjutused.OOPyl;

import java.util.ArrayList;

/**
 * Created by anni-bessie on 28.01.17.
 */
public class Sonaraamat1 {

    String raamatuKeel;
    ArrayList <String> sonad = new ArrayList<>();

    public Sonaraamat1(String raamatuKeel) {
        this.raamatuKeel = raamatuKeel;

    }

    public void sisestaSona(String sona) {
            sonad.add(sonad.size(), sona);
    }

    public String[] otsiEsimeseTaheJargi(String taht) {
        ArrayList <String> tulemus = new ArrayList<>();
        for (int i = 0; i < sonad.size(); i++) {
            if (sonad.get(i).startsWith(taht)){
                tulemus.add(sonad.get(i));
            }
            
        }
        String [] tulem = new String[tulemus.size()];
        for (int i = 0; i < tulemus.size(); i++) {
            tulem[i] = tulemus.get(i);
            
        }

        return tulem;
    }

    public void eemaldaSona(String sona) {
        for (int i = 0; i < sonad.size() ; i++) {
            if (sona == sonad.get(i)){
                sonad.remove(i);
            }
        }
    }

    public void misKeelesRaamatOn() {
        System.out.println(raamatuKeel);

    }
}
