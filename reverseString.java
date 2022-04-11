// Driver Code Starts

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver {

public static void main(String[] args)throws IOException
{
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine()); // Converting string into integer

    while(t-- >0){

        String str = read.readLine();
        System.out.println(new Reverse().reverseWord(str)); //Reverse class ke reverseWord method ko call karenge aur
                                                            //str pass karenge argument mein

    }

}

} //Driver Code Ends here
/
// User Function Starts here

class Reverse
{
public static String reverseWord(String str){ // This method will accept string arguments

StringBuilder sbld = new StringBuilder(str); // Creating sbld object of StringBuilder class
                                            // This class is taken because it has method reverse()
sbld.reverse(); // Using sbld object & reverse() method to reverse the string

return sbld.toString();

}

}