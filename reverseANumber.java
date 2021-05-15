package assignments;

import java.util.Scanner;

public class reverseANumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int reversedNumber = 0;
        while(n!=0){
            int d = n%10;
            reversedNumber = reversedNumber*10 + d;
            n = n/10;
        }
        System.out.println(reversedNumber);
    }
}
