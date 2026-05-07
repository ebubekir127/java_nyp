
package javanesneörnek2;


public class ArabaPark {

String plaka ;
double girisSaati;
double cikisSaati;


    public ArabaPark(String plaka, double girisSaati, double cikisSaati) {
        this.plaka = plaka;
        this.girisSaati = girisSaati;
        this.cikisSaati = cikisSaati;
    }
    double fiyatHesapla(){
    double minUcret=10.00;
    double saatlikUcret= 5.50;
    double kalinilanSure =this.cikisSaati-this.girisSaati;
      return minUcret+(kalinilanSure*saatlikUcret);
    }
    
    
    
    
    
    
    
}
