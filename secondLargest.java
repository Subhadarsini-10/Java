package assignments;

public class secondLargest {
    
    public static int findSecondLargest(int arr[], int n){
        int temp;
        for(int i=0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[n-2];
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 8, 12, 4, 6};
        System.out.println("Second largest element is "+ findSecondLargest(arr, 7));
    }
}
