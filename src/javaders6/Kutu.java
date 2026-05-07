
package javaders6;


    
public class Kutu {
 Renk renk; 
 String sekil;
 double en;
 double boy;   

    public Kutu(Renk renk, double en, double boy) {
        this.renk = renk;
        this.en = en;
        this.boy = boy;
        sekilBelirle();
    }
    
    
    public void bilgigoster(){
        System.out.println(" renk: "+ this.renk.color()+" sekil: "+this.sekil+" en: "+this.en+" boy: "+this.boy);
    
    }
    public void sekilBelirle(){
    if(this.en == this.boy){
    this.sekil ="kare";
    }else{
    this.sekil="dikdortgen";}
    }
    
}
