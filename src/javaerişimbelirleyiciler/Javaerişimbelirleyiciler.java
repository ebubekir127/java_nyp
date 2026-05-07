
package javaerişimbelirleyiciler;

public class Javaerişimbelirleyiciler {

    public static void main(String[] args) {
     Car car1 = new Car(2000,2006,120,"mavi");   
        
        
        //car1.Print(); bu artık çalışmaz cunku metodumuz private sadece sınıf ıcındekı metotların ıcınde  kullanabılırz artık bu metodu
       
        car1.bilgiGoster();
        
        System.currentTimeMillis();
    }
    
}
