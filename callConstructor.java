public class callConstructor {
    
int x; // x is attribute of class callConstructor

    // Creating Constructor
public callConstructor(){

x=5; // I think constructor ka use attribute ki value set karne ke liye hota hai

}

public static void main(String[] args) {

    callConstructor myObj = new callConstructor();

    System.out.println(myObj.x); //Same class ka object (myObj), same class ka attribute x, ki help se value 
                                 // print karenge
}


}
