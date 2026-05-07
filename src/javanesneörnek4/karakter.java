
package javanesneörnek4;

public class karakter {
String ad; 
int atack;   
int hp;       

    public karakter(String ad, int atack, int hp) {
        this.ad = ad;
        this.atack = atack;
        this.hp = hp;
    }
    void saldir(karakter kr){
        System.out.println(this.ad+","+kr.ad+" karakterine saldirdii");
    kr.hp -= this.atack;
        System.out.println("vurulan hasar"+this.atack);
        System.out.println("---------------------------------------------");
        kr.bilgiGoster();
      if(kr.hp<=0){
       kr.hp=0;
        System.out.println(kr.ad+" karakteri yenildi, "+this.ad+"kazandi" );} 
        System.out.println("saldiran karakter");
        bilgiGoster();
    }
void bilgiGoster(){
    System.out.println("---------------genel bilgiler----------------");
    System.out.println("karakterin ismi= "+this.ad );
    System.out.println("karakterin gucu = "+this.atack);
    System.out.println("karakterinin suanki cani="+this.hp);
    System.out.println("---------------------------------------------");
    System.out.println("");
}



}
