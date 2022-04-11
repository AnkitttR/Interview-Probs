public class NoArgConstAndMethod {
    
int i;
String s;

//constructor
public NoArgConstAndMethod(){

i=10;
s="No-Argument Constructor";

System.out.println(i);
System.out.println(s);
}

public void method(){

    System.out.println("Just a Method ....");
}



public static void main(String[] args) {
    
    NoArgConstAndMethod nac = new NoArgConstAndMethod(); //Constructor is executed, simultaneously with the Obj creation
    nac.method();  // But method is called with the help of created object

}


}
