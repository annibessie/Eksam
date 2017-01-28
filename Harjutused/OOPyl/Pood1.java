package Harjutused.OOPyl;

import javaEksam.src.OOP.Kassa;

/**
 * Created by anni-bessie on 28.01.17.
 */

/**
 * Siin failis kasutatakse objekti Kassa, aga Kassa klassi ei eksisteeri. Sinu ülesanne
 * on see luua.
 *
 * Käesolevat klassi ei tohi muuta - mitte ühtegi tähemärki!
 *
 * Jep, sama ülesanne oli ka proovieksamis.
 */
public class Pood1 {
    public static void main(String[] args) {

        String kassapidaja = "Laine";
        Kassa kassa1 = new Kassa(kassapidaja);

        kassa1.lisaToode("Piim");
        kassa1.lisaToode("Sai");
        kassa1.lisaToode("Lillkapsas");
        kassa1.lisaToode("Lamuu jäätis");
        kassa1.lisaToode("Kanepiküpsis");
        kassa1.eemaldaToode("Piim");
        kassa1.eemaldaToode("Sai");
        kassa1.lisaToode("Leib");

        kassa1.prindiOstutsekk();
        kassa1.prindiKassapidajaNimi();
    }
}
