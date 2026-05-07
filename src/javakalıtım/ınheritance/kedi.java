
package javakalıtım.ınheritance;


public class kedi extends hayvan{
    int ayakSayisi=5;
public kedi (){
    System.out.println("kedi olusturuluyor");

}
@Override 
public void Beslen(){
    System.out.println("kedi balik yiyor");
}
@Override
public void sesCıkar(){
    System.out.println("miyavliyor");

}


}
