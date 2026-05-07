package javahataayıklamaörnek2;

import java.util.Scanner;

public class JavaHataAyıklamaÖrnek2 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int[] dizi ={1,2,3};
     try{
         System.out.println("diziden gormek istediginiz indeksi secin");
         int index = sc.nextInt();
         System.out.println(index+".sayi= "+dizi[index]);
     
     }catch(Exception e){
         System.out.println("hata !"+e.toString()+"\n");
     }finally{
         System.out.println("program bitti");
     
     }
    }
    
}
