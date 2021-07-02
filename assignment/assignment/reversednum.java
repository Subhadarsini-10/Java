package assignment;

import java.util.Scanner;

public class reversednum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int reversednum = 0;
        while(n!=0){
            int d = n%10;
            reversednum = reversednum*10+d;
            n=n/10;
        }
        System.out.println(reversednum);
    }
}
