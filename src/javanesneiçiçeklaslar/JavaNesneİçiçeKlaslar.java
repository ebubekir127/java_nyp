package javanesneiçiçeklaslar;
public class JavaNesneİçiçeKlaslar {
//Nested Class (iç içe klaslard )
// Inner class (iç sınıflar)
// Static
// nonStatic
// local class
// anonymous class    
    
    public static void main(String[] args) {

     NonStatic n1 = new NonStatic();
     NonStatic.Inner inner =n1.new Inner();// iki non Static sınıfdan nesne uretme
        
       // inner.run();
        
     Static.Inner s = new Static.Inner();  // icdekı static dısdakı Nonstatic sınıflardan nesne uretmme
        
    // s.run();
        
    Local l = new Local();
    l.run();
    
    Anonim a = new Anonim(){
    public void run(){
        System.out.println("bu anonim sinifina ait bır metot"); 
    }  
  };
            
    a.run();// bu normal claasdakı metodu Override etti yenı metotlarda yazilbilir ama ana clasdaki metotla ayni isimde olmali
 

    
    }
    
}
