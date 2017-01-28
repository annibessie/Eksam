package Harjutused.OOPyl;

/**
 * Created by anni-bessie on 28.01.17.
 */
/**
 * Loo see Pastaka objekt, mida kirjanik soovib siin kasutada.
 *
 * Reeglid:
 * 1. Käesolevat faili ei tohi muuta
 * 2. Kui pastakas kirjutab siis tuleb tekst konsooli - kuni tinti jätkub.
 * 3. Iga täht kulutab ühe ühiku.
 */
public class Kirjanik1 {
    public static void main(String[] args) {
        int tindiKogus = 60;

        Pastakas1 pastakas1 = new Pastakas1(tindiKogus);

        pastakas1.kirjuta("Elu oleks palju lihtsam, kui meil oleks selle lähtekood.");

        pastakas1.prindiPaljuTintiAlles();

        pastakas1.kirjuta("Õiged progejad ei kommenteeri oma koodi. Kui seda oli raske kirjutada, siis peab olema seda ka raske lugeda!");

    }
}

