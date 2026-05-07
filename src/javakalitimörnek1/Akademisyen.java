
package javakalitimörnek1;

public class Akademisyen extends Calisan{
String bolum;
String ders;
String gorev;

    public Akademisyen(String isim,int telefon,String bolum, String ders, String gorev) {
        super (isim, telefon);
        this.bolum = bolum;
        this.ders = ders;
        this.gorev = gorev;
    }


public void derseGir(){
    System.out.println("Akademisyen derse girdi");
}
}
