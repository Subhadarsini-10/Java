package assignments;

import java.util.Scanner;

public class powerOfANmuber {
    int x;
    int n;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the base value");
        int x = s.nextInt();
        System.out.println("Enter the exponential value");
        int n = s.nextInt();
        double a = Math.pow(x, n);
        System.out.println("Result:" + a);
    }
}
