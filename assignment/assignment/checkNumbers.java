package assignment;

import java.util.Scanner;

public class checkNumbers {

    public static boolean checkNumber(int[] a, int x, int n){
        if(n == 0){
            return false;
        }
        if(a[n-1] == x){
            return true;
        }
        return checkNumber(a, x, n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++){
            a[i] = s.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int target = s.nextInt();
        boolean bool = checkNumber(a, target, n);
        if(bool){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }
    }
}
