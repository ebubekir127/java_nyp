package javahataayıklamaörnek3;


public class JavaHataAyıklamaÖrnek3 {

    public static void main(String[] args) {
BankaHesabi b1 =new BankaHesabi();
try{
b1.paraCek(1500);

}catch(YetersizBakiyeException a){
    System.out.println(a.getMessage());
}finally{
    System.out.println("sistem calismayi durdurdu");
}



    }
    
}
