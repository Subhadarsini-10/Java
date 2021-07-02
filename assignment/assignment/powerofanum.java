package assignment;

import java.util.Scanner;

public class powerofanum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the base value:");
        int x = s.nextInt();
        System.out.println("Enter the exponent:");
        int n = s.nextInt();
        int ans = (int)Math.pow(x, n);
        System.out.println("Answer:" + ans);
    }
}
