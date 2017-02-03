package Harjutused.Eksam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by anni-bessie on 3.02.17.
 */
public class statistika {
    int omahind = 2;
    int poehind = 5;
    int poodisaadetud;
    int ostetud;
    int alles;
    int paevi;
    int kogukasum;
    int kogukulu;


    ArrayList <Integer> poodidesse = new ArrayList<>();
    ArrayList <Integer> osteti = new ArrayList<>();
    ArrayList<Integer> paevad = new ArrayList<>();

    public void paevi(){
        Scanner input = new Scanner(System.in);

        System.out.println("Mitu päeva on statistikat peetud? ");
        paevi = Integer.parseInt(input.next());
        paevad.add(paevi);
    }

    public void poodisaadetud (){

        for (int i = 0; i < paevi; i++) {
            Scanner input = new Scanner(System.in);

            System.out.println("Kui palju jäätist poodidesse saadeti? ");
            poodisaadetud = Integer.parseInt(input.next());
            poodidesse.add(poodisaadetud);
        }
    }

    int l;
    int poodikokku = poodisaadetud;

    public void poodikokku () {
        while (l < paevi) {
            poodikokku = poodikokku + poodisaadetud;
            l++;
        }
        System.out.println("Poodi kokku saadeti:" + poodikokku + " jäätist.");
    }

    public void ostetud (){

        for (int i = 0; i < paevi; i++) {
            Scanner input = new Scanner(System.in);

            System.out.println("Kui palju jäätiseid osteti?: ");
            ostetud = Integer.parseInt(input.next());
            osteti.add(ostetud);
        }
    }

    int z;
    int ostetikokku = ostetud;

    public void ostetikokku () {
        while (z < paevi) {
            ostetikokku = ostetikokku + ostetud;
            z++;
        }
        System.out.println("Poodidest osteti kokku: " + ostetikokku + " jäätist.");
    }

    public void alles (){
        alles = poodikokku - ostetikokku;
        System.out.println("Alles jäi: " + alles + " jäätist");
    }

    public void kogukulu () {
        kogukulu = poodikokku * omahind;
        System.out.println("Kogukulu oli: " + kogukulu + " eurot.");
    }

    public void kogukasum () {
        kogukasum = (ostetikokku * poehind) - kogukulu;
        System.out.println("Kogukasum oli: " + kogukasum + " eurot.");
    }

    public void ideaalnehind () {
        if (kogukasum > kogukulu){
            System.out.println("Tootel on ideaalne hind.");
        } else {
            System.out.println("Peaksid hinda tõstma.");
        }
    }

}
