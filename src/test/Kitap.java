
package test;

public class Kitap {
    public String isim;
    public String yazar;
    public int SayfaSayısı;
    public boolean mevcutmu;


    public Kitap(String isim, String yazar, int sayfaSayısı) {
        this.isim = isim;
        this.yazar = yazar;
        this.SayfaSayısı = sayfaSayısı;
        this.mevcutmu = true;
    }

    public String oduncAlındı(Kitap kitap){
        return " '"+kitap.isim + "' kitabini  aldiniz.";
    }

    public String iadeEdildi(Kitap kitap){
        return " '"+kitap.isim+"' kitabini iade ettiniz.";
    }



}