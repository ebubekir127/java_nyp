
package javanesneörnek4;


public class Javanesneörnek4 {

    
    public static void main(String[] args) {
        karakter mario =new karakter("mario",15,300);
        karakter luıccı = new karakter("luicci",10,200);
        mario.saldir(luıccı);
        luıccı.saldir(mario);
        luıccı.saldir(mario);
        luıccı.saldir(mario);
        luıccı.saldir(mario);
    }
    
}
