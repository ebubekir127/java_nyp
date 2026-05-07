
package javanesnekalıtımörnek2;


public class Javanesnekalıtımörnek2 {

   
    public static void main(String[] args) {
       bankaKart bk = new bankaKart("ebubekir",1000);
       krediKart kk= new krediKart(2000,"ebubekir",1000);
       gencKart gk = new gencKart("ebubekir",1000);
      bk.Alisveris(500);
      bk.bilgi();
        System.out.println("");
      kk.Alisveris(500);
      kk.bilgi();
        System.out.println("");
      gk.Alisveris(500);
      gk.bilgi();
      
        
               
    }
    
}
