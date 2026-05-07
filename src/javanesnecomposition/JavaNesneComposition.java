
package javanesnecomposition;


public class JavaNesneComposition {

   
    public static void main(String[] args) {
        Car car1 = new Car("bmw",2016,"v8");
        System.out.println(car1.model);
        System.out.println(car1.yil);
        System.out.println(car1.motor.motorTipi);
        
        car1.calistir();
        
    }
    
}
