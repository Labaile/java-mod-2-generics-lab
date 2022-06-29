public class SampleGenerics {

public static void main(String args[]){

    Integer[]intArray = {1,2,3,4,5};
    Double[]doubleArray = {5.5,4.4,3.3,2.2,1.1};
    Character[] charArray = {'H','E','L','L','O'};
    String[] stringArray = {"B","Y","E"};

    displayArray(intArray);
    displayArray(doubleArray);
    displayArray(charArray);
    displayArray(stringArray);





}//close main

public static <E> void displayArray(E[] array){

    for (E x : array) {
        System.out.print(x+ "");
    }
    System.out.println();

}

    
}//close class
