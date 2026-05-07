
package javakalıtım.ınheritance;


public class hayvan extends Canli{
    int ayakSayisi;
    String ad;
    public hayvan(){
         ad = "yeni tur";
        System.out.println("hayvan olusturuluyor");
    }
    public void Beslen(){
      
        System.out.println("hayvan besleniyor");
    
    }
    @Override
    public void sesCıkar(){
        System.out.println("hayvan ses cıkarıyor");
    }
    
    
}
