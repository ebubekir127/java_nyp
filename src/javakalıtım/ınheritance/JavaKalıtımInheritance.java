
package javakalıtım.ınheritance;

public class JavaKalıtımInheritance {

    
    public static void main(String[] args) {
        kopek kp1 = new kopek();
        kp1.Beslen();
        kp1.sesCıkar();
        System.out.println("");
        kedi kd1 = new kedi();
        kd1.Beslen();
        kd1.sesCıkar();
        System.out.println("");
        System.out.println("kedi ayaksayisi"+kd1.ayakSayisi);
        System.out.println("kedi ayaksayisi"+kp1.ayakSayisi);
    }
    
}
