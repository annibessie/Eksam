package Harjutused.OOPyl;

/**
 * Created by anni-bessie on 28.01.17.
 */

import java.util.Arrays;

/**
 * Raamatukogus on Sõnaraamat. Õigemini siis on, kui sa selle klassi kirjutad.
 *
 * Raamatukogu klassi ei tohi muuta.
 */
public class Raamatukogu1 {
    public static void main(String[] args) {

        String raamatuKeel = "Eesti";
        Sonaraamat1 raamat = new Sonaraamat1(raamatuKeel);
        raamat.sisestaSona("puaas");
        raamat.sisestaSona("uubuma");
        raamat.sisestaSona("uudikristamine");
        raamat.sisestaSona("suaree");
        raamat.sisestaSona("sarkasm");
        raamat.sisestaSona("iroonia");

        String[] vaste = raamat.otsiEsimeseTaheJargi("u");
        System.out.println(Arrays.toString(vaste));

        //Arraylist ja siis teha String list'iks.
        //Otsingu teen ArrayList'iga

        String[] vaste2 = raamat.otsiEsimeseTaheJargi("s");
        System.out.println(Arrays.toString(vaste2));

        raamat.eemaldaSona(vaste2[0]);

        raamat.misKeelesRaamatOn();

    }
}
