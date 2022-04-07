public class twoDarray{

public static void main(String[] args) {
    
// Insert correct value of datatype

// ______ myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

int[][] myNumbers = {{1,2,3,4} , {5,6,7}};

System.out.println(myNumbers[0][0]); // [0] index in first place is for {1,2,3,4} whole // [1] index in first place is for {5,6,7} whole

System.out.println(myNumbers[0][3]); // [] index at 2nd place is for extracting internal values of {1,2,3,4} or {5,6,7}

System.out.println(myNumbers[1][0]); // Output = 5

System.out.println(myNumbers[1][2]); // Output = 7


}

}