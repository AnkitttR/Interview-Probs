// Import the HashMap class
import java.util.HashMap;

public class HashMapu{
public static void main(String[] args){
//Create a Hashmap object called capitalCities
HashMap<String,String> capitalCities = new HashMap<String,String>();

//Add keys and values (Country, City)
capitalCities.put("India","Delhi");
capitalCities.put("Nepal","Kathmandu");
capitalCities.put("Bangladesh","Dhaka");
capitalCities.put("Bhutan","Thimphu");
capitalCities.put("USA","Washington DC");

System.out.println(capitalCities);

}


}