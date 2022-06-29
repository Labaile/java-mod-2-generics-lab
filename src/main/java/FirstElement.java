public class FirstElement { //declares the class named Problem

    public static void main(String[] args) {//main method to execute tasks
        Integer[] inputInt = { 1, 2, 3 }; //declares an array of Integers; variableName = inputInt
        Integer[] inputEmpty = new Integer[5];//declares an empty array of size 5
        String[] inputStr = { "Cake", "Donut", "Cupcake" };

         System.out.println(getFirstElement(inputInt)); // 1
         System.out.println(getFirstElement(inputEmpty)); // null
         System.out.println(getFirstElement(inputStr)); // Cake
    }//close main

   // declare the getFirstElement method here
    public static <E> E getFirstElement(E[] array) {
        return array[0]; //returns thefirst element of the array
    }//close getFirstElement

}//close Problem class




