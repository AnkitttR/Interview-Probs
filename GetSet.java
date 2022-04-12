

//Base Class
public class GetSet {
    private String name;
 
    // Defining Getter Method
    public String getName() {  //Getting or reading the value of variable "name"
      return name;
    }
 
    // Defining Setter Method
    public void setName(String newName) {
      this.name = newName;     // Setting or writing the value of variable "name"
    }
 
 

//Driver or Main method

    public static void main(String[] args) {
      GetSet myObj = new GetSet();
      //myObj.setName("Ramji");
      myObj.setName("Krishnaji");                       // Executing the setter(Writing value in variable newName) method
      System.out.println(myObj.getName());        // Executing the getter method (Reading value from variable name)
    }
  }

