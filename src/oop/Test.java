
package oop;



public class Test {
    public static void main(String args[]){
    araba arac = new araba();
    arac.hiz =50;
    arac.beygir=100;
    arac.marka="toyota";
    arac.motorCC=500;
    arac.yil=2001;
    arac.km =60000;
    
    arac.bilgiGoster();
    
    ArabaSeyhat araba = new ArabaSeyhat(10);
        araba.seyehatEt(150);
        araba.yakitEkle(10);
        araba.seyehatEt(100);
        araba.seyehatEt(50);
    
    
    }
}
