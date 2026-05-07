
package javanesneınterface;

public class MultiFunctionDevice implements Printable,Scannable {
    @Override 
    public void print(){
        System.out.println("cok fonksiyonlu cihaz yaziyor...");
    }
    @Override 
    public void scan(){
        System.out.println("cok fonksiyonlu cihaz tariyor...");}
}
