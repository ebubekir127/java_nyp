
package javanesneörnek3;


public class kalem {
    public kalem(String renk, int uzunluk) {
        this.renk = renk;
        this.uzunluk = uzunluk;
    }
String renk;
int uzunluk;

 String yaz(defter df){
 
 return   this.renk+" renkli kalem "+df.tür+" deftere "+df.yazdir(df)+" yazdi";
 
 
 }



}
