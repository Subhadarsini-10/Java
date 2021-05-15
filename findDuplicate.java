package assignments;

public class findDuplicate {
        void findRepeating(int arr[], int size){
            int i,j;
            System.out.println("Repeated elements are:");
            for(i = 0; i< size; i++){
                for(j = i+1; j<size; j++){
                    if(arr[i] == arr[j])
                    System.out.println(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        findDuplicate repeat = new findDuplicate();
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int arr_size = arr.length;
        repeat.findRepeating(arr, arr_size);
    }
}
