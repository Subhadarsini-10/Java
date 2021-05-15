package assignments;

public class pushZero {
    
    static void pushZeroToEnd(int arr[], int n){
        int count = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]!=0){
                arr[count++] = arr[i];
            }
        }
        while(count < n){
            arr[count++] = 0;  
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 8, 0, 0, 4, 7, 4, 0, 2};
        int n = arr.length;
        pushZeroToEnd(arr, n);
        System.out.println("Arrays aftre pushing zeros to the back");
        for(int i = 0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
    }
}

