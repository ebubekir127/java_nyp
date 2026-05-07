// diziler ve listeler
package javaders4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


 
public class Javaders4 {

    
    public static void main(String[] args) {
//      int [] notlar = {70,89,92,85 };
//        
//        int toplam =0;
//        
//        for(int i = 0;i < notlar.length; i++){
//        toplam += notlar[i];
//            
//        }
//            System.out.println("toplam=" +toplam);
//        int sayac = 0;
//     for (int a: notlar){
//         System.out.println("dizi["+sayac+"].elemani"+a);
//     sayac++;
//     }
//        Scanner sc = new Scanner(System.in);     
//        System.out.println("lutfen dizinizin kac elemanli olacagini secin");       
//          int n = sc.nextInt();
//          int[] dizi = new int[n];
//          System.out.println("dizi elemanlarini giriniz");
//          for(int i = 0 ;i<n ;i++){
//              System.out.println("dizinin"+i+".elemanini gir");
//           dizi[i]= sc.nextInt();
//          }
//         
//     for(int i = 0;i<n; i++){
//         System.out.println("dizinin elemanlari"+dizi[i]);

//    }
//     int en_buyuk= dizi[0];
//     int en_kucuk= dizi[0];
//     
//     
//     for(int i = 0;i<n; i++){
//     if(en_buyuk>dizi[i]){
//         en_buyuk=dizi[i];
//     } 
//     }
//     for(int i = 0;i<n; i++){
//     if(en_kucuk<dizi[i]){
//         en_kucuk=dizi[i];
//     }}
//         System.out.println("en buyuk eleman"+en_buyuk);
//         System.out.println("en kucuk eleman"+en_kucuk);
//         
//         
//         Arrays.sort(dizi);
//         
//         System.out.println("sirali dizi"+Arrays.toString(dizi));
//   
   //arraylist mantıgı
//    ArrayList<String> programlar = new ArrayList<>();
//    programlar.add("java");
//    programlar.add("c#");
//    programlar.add("c++");
//    programlar.add("pyhton");
//    programlar.add("php");
//    programlar.add("js");
//    
//    
//    Integer aranan = 15;
//        for (int i = 0; i < programlar.size(); i++) {
//            
//            System.out.println(programlar.get(i));       
//        }
    
         //DİZYE ELEMAN ALMA
    Scanner sc= new Scanner(System.in);
//        System.out.println("kac elemanli dizi olusturmak istersiniz");
//        int y =sc.nextInt();
//        int[] dizi2 = new int[y];
//        for (int i = 0; i < y; i++) {
//            System.out.print("dizinin["+(y+1)+".]elemanini gir  ");
//            dizi2[i]=sc.nextInt();
//        }
//        System.out.print("dizi=");
//        for (int i = 0; i < y; i++) {
//            System.out.print(dizi2[i]+",");
//        }
//        System.out.println("");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        System.out.println("dizinizin kac elemanli olacagini seciniz");
//    int n =sc.nextInt();
//   Random random= new Random();
//    int[]dizi=new int[n];
//        for (int i = 0; i < n; i++) {
//            dizi[i]=random.nextInt(10);
//        }
//        System.out.print("dizi= ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(dizi[i]+",");   
//        }
//        System.out.println("");
//        
//        int a =0;
//        for (int i = 0; i < n; i++) {
//        if(dizi[i]==8){
//        a++;}    
//        }
//        System.out.println("dizide "+a+" tane[8]var");
//        
//        
//        int b=0;
//        for (int i = 0; i < n; i++) {
//        if(dizi[i]==5){
//        b++;}    
//        }
//        System.out.println("dizide "+b+" tane[5]var");
//        
//        
//        int c=0;
//        for (int i = 0; i < n; i++) {
//        if(dizi[i]==3){
//        c++;}    
//        }
//        System.out.println("dizide "+c+" tane[3]var");
    
    
    System.out.println("\n--- TEKRAR EDENLER RAPORU ---");

  int n =sc.nextInt();
   Random random= new Random();
    int[]dizi=new int[n];  
    
     for (int i = 0; i < n; i++) {
           dizi[i]=random.nextInt(10);
       }
       System.out.print("dizi= ");
        for (int i = 0; i < n; i++) {
           System.out.print(dizi[i]+",");   
        }
       System.out.println("");
    
for (int i = 0; i < n; i++) {
    int mevcutSayi = dizi[i];
    int tekrarSayisi = 0;
    boolean dahaOnceSayildiMi = false;

    for (int k = 0; k < i; k++) {
        if (dizi[k] == mevcutSayi) {
            dahaOnceSayildiMi = true;
            break; 
        }
    }

    if (!dahaOnceSayildiMi) {
        
        for (int j = 0; j < n; j++) {
            if (dizi[j] == mevcutSayi) {
                tekrarSayisi++;
            }
        }
        
        if (tekrarSayisi > 1) {
            System.out.println(mevcutSayi + " sayisi " + tekrarSayisi + " kez tekrar ediyor.");
        }
    }
}
    
    
    
    
    
    
    }
    
} 
