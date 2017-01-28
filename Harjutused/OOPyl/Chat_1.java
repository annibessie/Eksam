package Harjutused.OOPyl;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by anni-bessie on 28.01.17.
 */
public class Chat_1 {

    String nimi;
    ArrayList<String[]> messages = new ArrayList();  //tohib olla ainult String

    public Chat_1(String toaNimi) {

        nimi = toaNimi;

    }

    public void sisestaSonum(String kasutaja, String s) {
        String[] rida = new String [2];
        rida[0] = kasutaja;
        rida[1] = s;
        messages.add(rida);
    }

    public void prindiKoikSonumidKoosKasutajanimega() {
        for (int i= 0; i< messages.size(); i++) {
            System.out.println(Arrays.toString(messages.get(i)));
        }
        System.out.println();
    }

    public void adminKustutabSonumi(String kustutatav) {
        for (int i = 0; i < messages.size(); i++) {
            if (messages.get(i)[1].equals(kustutatav)){
                messages.remove(i);
            }

        }

    }

    public void prindiToaNimi() {

        System.out.println(nimi);

    }
}

