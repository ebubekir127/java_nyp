
package javanesneınterface;


public class printer implements Printable {
    int printSayisi=0;
    @Override 
    public void print() {
        
        if(this.printSayisi>=this.max)
            System.out.println("yazma hakkkiniz bitti");
        else{
           printSayisi++;
        System.out.println("yazici yaziyor..");
        }
    }
}
