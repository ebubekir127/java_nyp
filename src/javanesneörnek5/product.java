
package javanesneörnek5;


public class product {
    private String ad; 
    private int fiyat;
    private int adet ;    

    public product(String ad, int fiyat, int adet) {
        this.ad = ad;
        this.fiyat = fiyat;
        if(adet<0){
            System.out.println("negatif sayi adeti giridiniz 0 olarak ayarlandi");
        this.adet= 0;     
        }else{
        this.adet=adet; }
    } 
    
   public void satinAl(int alinacakAdet){
   if(alinacakAdet>adet ){
       System.out.println("uzgünüm  stokta yeteri kadar"+this.ad  +"yok");
   }else{
   this.adet = adet-alinacakAdet;
       System.out.println(this.ad+"urunden "+alinacakAdet+" kadar aldiniz");
       System.out.println("toplam fiyat = "+alinacakAdet*this.fiyat);
       System.out.println("");}
        
   }      
        void bilgiGoster(){
            System.out.println("______________________________________");    
            System.out.println("urun ismi: "+this.ad);
            System.out.println("urunn fiyati: "+this.fiyat);
            System.out.println("stok adedi:"+this.adet);
            System.out.println("______________________________________");     
        }
   
    }

