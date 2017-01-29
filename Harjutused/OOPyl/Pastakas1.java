package Harjutused.OOPyl;

/**
 * Created by anni-bessie on 28.01.17.
 */
public class Pastakas1 {

    int tint;

    public Pastakas1(int tindiKogus) {
        this.tint = tindiKogus;
        //tint = tindiKogus;

    }

    public void kirjuta(String kiri) {
        if (tint > kiri.length()){
            System.out.println(kiri);
            tint = tint - kiri.length();
        } else {
            System.out.println(kiri.substring(0, tint));
        }
    }

    public void prindiPaljuTintiAlles() {
        System.out.println(tint);
    }
}
