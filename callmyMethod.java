// Call myMethod on the object.

public class callmyMethod {
    
        public void myMethod() {
          System.out.println("Hello World");
        }
      
public static void main(String[] args) {
    
    callmyMethod myObj = new callmyMethod(); //myObj object hai callmyMethod class ka
    myObj.myMethod();                        //myMethod() method hai callmyMethod class ka
}                                             // Hence same class ke object ki help se usi class ke method ko call kar rahe hain

}
