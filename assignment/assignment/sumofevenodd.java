package assignment;

import java.util.Scanner;

public class sumofevenodd {
    public static void main(String[] args) {
        int n, sumE = 0, sumO = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("ENter the number of elements in an array:");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements in an array:");
        for(int i = 0; i<n; i++){
            a[i] = s.nextInt();
        }
        for(int i = 0; i<n; i++){
            if(a[i]%2 == 0){
                sumE = sumE + a[i];
            }else{
                sumO = sumO + a[i];
            }
        }
        System.out.println("Sum of even numbers are:" + sumE);
        System.out.println("Sum of odd numbers are:" + sumO);
    }
}
