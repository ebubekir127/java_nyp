
package javakalitimörnek1;

public class Asistan extends Akademisyen {
String yuksekLisans;

    public Asistan(String yuksekLisans, String isim, int telefon, String bolum, String ders, String gorev) {
        super(isim,telefon, bolum, ders, gorev);
        
        this.yuksekLisans = yuksekLisans;
    }

}
