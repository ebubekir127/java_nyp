package oop;


public class araba {
    int hiz;
   String marka;
   int motorCC;
   int beygir;
   int yil;
   int km;
   public void bilgiGoster(){
    System.out.println("aracin hizi"+hiz);
    System.out.println("aracin markasi"+marka);
    System.out.println("aracin motoru"+motorCC);
    System.out.println("aracin beygiri"+beygir);
    System.out.println("aracin yili"+yil);
    System.out.println("aracin kmsi"+km);}
   public void hizlan(){
     
     hiz +=5;
   }
   public void yavasla(){
   hiz -=5;
   }
   public void hiziYaz(){
       System.out.println("hiz:"+hiz);
   }
   
   
}
