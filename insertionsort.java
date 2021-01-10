
public class insertionsort {

    public static void main(String[] args) {
        
        int[] intArray = {22, 13, -10, 15, 53};

        for(int firstUnsortedElement = 1; firstUnsortedElement < intArray.length; firstUnsortedElement++){
            int newElement = intArray[firstUnsortedElement];

            int i;

            for(i = firstUnsortedElement; i > 0 && intArray[i - 1] > newElement; i--){
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement;
            }
            for (int i = 0; i<intArray.length; i++){
                System.out.println(intArray[i]);
        }
    }
}
