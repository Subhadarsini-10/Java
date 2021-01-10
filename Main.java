public class Main {
    
    public static void main(String[] args){
        
        int intArray[] = {22,-19,14,7,1,50};

        for(int lastUnsortedindex = intArray.length-1; lastUnsortedindex > 0; lastUnsortedindex--) {

            for(int i = 0; i < lastUnsortedindex; i++){
                if(intArray[i] > intArray[i+ 1]){
                    swap(intArray, i, i+1);
                } 
            }
        }

        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
    public static void swap(int[] array, int i, int j) {
                if(i == j){
                    return;
                }
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

    }
 }


