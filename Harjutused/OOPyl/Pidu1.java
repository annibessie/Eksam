package Harjutused.OOPyl;

/**
 * Created by anni-bessie on 28.01.17.
 */
/**
 * Peole on kutsutud rohkem inimesi kui korterisse mahub. Sinu ülesanne on Korteri
 * objekt ehitada nii, et üleliigsetest keelduda saaks.
 *
 * Reeglid
 * 1. Pidu klassi muuta ei tohi.
 * 2. Maja maksimum on 10 inimest.
 * 3. Kui Korter on täis siis on täis. Rohkem juurde ei saa
 */
public class Pidu1 {
    public static void main(String[] args) {

        int mahutab = 10;
        Korter1 korter1 = new Korter1(mahutab);

        korter1.saabus("Taavi");
        korter1.saabus("Pilve");
        korter1.saabus("Maarika");
        korter1.saabus("Joonas");
        korter1.saabus("Kalle");
        korter1.saabus("Muri");
        korter1.saabus("Sille");

        korter1.prindiKylalisteArv();
        korter1.prindiPaljuVeelMahub();

        korter1.lahkus("Taavi");

        korter1.saabus("Tambet");
        korter1.saabus("Liisa");
        korter1.saabus("Liis");
        korter1.saabus("Veidro");
        korter1.saabus("Moonika");
        korter1.saabus("Politsei");

        korter1.lahkus("Sille");

        korter1.prindiKylalisteArv(); // peaks olema 9, järjekorda ei ole.
    }
}
