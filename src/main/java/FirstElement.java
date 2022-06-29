import java.util.Arrays;//import the Arrays library


class Problem { //declares the class
    // declare the getFirstElement method here
    static <E> String getFirstElement(E[] array) {
        return Arrays.toString(array); //returns the list of actual values in the array
    }//close getFirstElement

}//close Problem class

public class FirstElement { //declares a class method
    public static void main(String[] args) {//main method to execute tasks
        Integer[] inputInt = { 1, 2, 3 }; //declares an array of Integers; variableName = inputInt
        Integer[] inputEmpty = new Integer[5];//declares an empty array of size 5
        String[] inputStr = { "Cake", "Donut", "Cupcake" };

         System.out.println(Problem.getFirstElement(inputInt)); // 1
         System.out.println(Problem.getFirstElement(inputEmpty)); // null
         System.out.println(Problem.getFirstElement(inputStr)); // Cake
    }//close main
}//close FirstElement




