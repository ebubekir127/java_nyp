
package javahataayıklamaörnek3;

public class BankaHesabi {
private int bakiye= 500;  
 public void paraCek(int deger)throws YetersizBakiyeException{
 if(deger>this.bakiye){
 
  throw new YetersizBakiyeException("yetersiz bakiye hatasi mevcut bakiye: "+this.bakiye); 
 }
 bakiye-=deger;
     System.out.println("para cekildi kalan deger="+this.bakiye);
 }   
    
    
}
