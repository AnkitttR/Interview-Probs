public class ForEachLoop {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String i : cars){    // outputs all elements in the cars array, using a "for-each" loop
            System.out.println(i);
        }
    }
}
