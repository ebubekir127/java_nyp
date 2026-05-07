
package javanesneörnek8;


public class Javanesneörnek8 {

    public static void main(String[] args) {
   lamba lm =new lamba("xiaomi");
   kumanda km= new kumanda("xiaomi");
   
   km.lambaAc(lm);
        System.out.println("");
   km.lambaKapat(lm);
        System.out.println("");
   km.lambaKapat(lm);
   km.lambaAc(lm);
        System.out.println("________________");
   km.setparlaklik(lm, 150);
   km.lambaBilgi(lm);
        System.out.println("");
   km.setparlaklik(lm, 70);
        System.out.println("");
   km.lambaBilgi(lm);
   
    }
    
}
