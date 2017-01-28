package Harjutused.OOPyl;


/**
 * Created by anni-bessie on 28.01.17.
 */
/**
 * Loo Chat klass, et käesolev programm saaks normaalselt toimida.
 *
 * On üks reegel: Gitter klassi muuta ei tohi.
 */
public class Gitter1 {
    public static void main(String[] args) {

        String toaNimi = "Elutuba";
        Chat_1 chat_1 = new Chat_1(toaNimi);

        chat_1.sisestaSonum("Taavi", "Tere, on keegi siin?");
        chat_1.sisestaSonum("Eva", "Tsau, ilus poiss. Mis otsid?");
        chat_1.sisestaSonum("Taavi", "Kuule, ega sa ei tea kuidas seda OOP ülesannet lahendada?");
        chat_1.sisestaSonum("Taavi", "Pean siin nii kasutajanime kui ka sõnumi kuhugi salvestama..");
        chat_1.sisestaSonum("Eva", "Oh sind totut, võimalusi on ju mitu.");
        chat_1.sisestaSonum("Eva", "Aga pead ise välja mõtlema");
        chat_1.sisestaSonum("Eva", "sest õppejõud näeb meie kirjutatut.");
        chat_1.sisestaSonum("Taavi", "Kurat ta jälle nii raske eksami tegi..");

        chat_1.prindiKoikSonumidKoosKasutajanimega();

        chat_1.adminKustutabSonumi("Kurat ta jälle nii raske eksami tegi..");
        chat_1.sisestaSonum("Krister", "Sul veab, et siin chatis välja viskamise funktsionaalsust ei ole :)");

        chat_1.prindiKoikSonumidKoosKasutajanimega();
        chat_1.prindiToaNimi();
    }
}

