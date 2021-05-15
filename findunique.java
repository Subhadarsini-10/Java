package assignments;

public class findunique {

    static int findSingle(int arr[], int arr_size){
        int res = arr[0];
        for(int i = 1; i<arr_size; i++){
            res = res ^ arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 4, 5, 3, 4};
        int n = arr.length;
        System.out.println("Element occuring once is " + findSingle(arr, n)+" ");
    }
}
