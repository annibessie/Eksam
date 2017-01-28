package Harjutused.OOPyl;

/**
 * Created by anni-bessie on 28.01.17.
 */

/**
 * Loo klass Zelda, mis käitub nii nagu käesolev programm ootab.
 *
 * Reeglid:
 * 1. Legend klassi muuta ei tohi.
 * 2. Zelda kaotab nii palju elusid kui kollil elusid on.
 */
public class Legend1 {
    public static void main(String[] args) {
        int kollilElusid;

        int elusid = 35;
        Zelda1 zelda1 = new Zelda1(elusid);

        kollilElusid = 25;
        zelda1.kaklusKolliga(kollilElusid);

        zelda1.prindiMituEluAlles();

        kollilElusid = 57;
        zelda1.kaklusKolliga(kollilElusid);

        zelda1.prindiKasOnElus();

    }
}
