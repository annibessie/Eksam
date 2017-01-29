package Harjutused.OOPyl;

import java.util.ArrayList;

/**
 * Created by anni-bessie on 28.01.17.
 */
public class Zelda1 {

        int elusid;

        public Zelda1(int elusid) {
            this.elusid = elusid;
        }

        public void kaklusKolliga(int kollilElusid) {
            elusid = elusid - kollilElusid;

        }

        public void prindiMituEluAlles() {
            System.out.println(elusid);

        }

        public void prindiKasOnElus() {
            if (elusid > 0){
                System.out.println("Jäid ellu!");
            } else {
                System.out.println("Oled kutu!");
            }
        }
}

