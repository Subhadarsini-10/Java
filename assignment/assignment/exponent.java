package assignment;

import java.util.Scanner;

public class exponent{

    public static double power(double x, int n){
        if(n != 0){ 
            return x*power(x, n-1);
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        int n = s.nextInt();
        System.out.println(power(x, n));
    }
}