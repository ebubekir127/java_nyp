
package javanesneörnek1;


public class isciveri {
String ad;
double maas;
int CalismaSaati;
int iseGirilenYil;
double vergi;
int bonus;
double prim;

    public isciveri(String ad,double maas,int CalismaSaati,int iseGirilenYil){
       this.ad=ad;
       this.maas=maas;
       this.CalismaSaati=CalismaSaati;
       this.iseGirilenYil=iseGirilenYil;
    
    }

public double VergiHesapla(){
   
    if(this.maas>1000)
    this.vergi =((this.maas*3)/100);
    else 
   vergi=0;     
    
return vergi;
}




public double Bonus(){

    if(this.CalismaSaati>225){
  this.bonus = (this.CalismaSaati-225)*30;
          }else bonus=0;
return bonus;
}


public double MaasArtis(){

int buYil=2015;
int sene=buYil-iseGirilenYil;

if (sene>19)
this.prim=((this.maas)*15/100);   
else if(sene>10)
 this.prim=((this.maas*10)/100);
else
 this.prim = ((this.maas*5)/100) ; 
return prim;
}



void BilgiGoster(){
    System.out.println("isim= "+this.ad);
    System.out.println("maas= "+this.maas);
    System.out.println("calisma saati aylik= "+this.CalismaSaati);
    System.out.println("ise girilen yil=  "+this.iseGirilenYil);
    System.out.println("vergi "+ this.vergi );
    System.out.println("bonus= "+this.bonus);
    System.out.println("prim= "+this.prim);
    



}








}
