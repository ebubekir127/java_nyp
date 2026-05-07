
package javanesnekapsullemegettervesetter;


public class JavaNesneKapsullemeGetterVeSetter {

    
    public static void main(String[] args) {
        kitap kt1=new kitap("kasagi",200,"omer seyfettin");
        System.out.println(kt1.getSayfaSayisi());
        kt1.setSayfaSayisi(300);
        kt1.getSayfaSayisi();
        System.out.println(kt1.getSayfaSayisi());
        
    }
    
}
