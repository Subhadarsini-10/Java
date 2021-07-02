package assignment;
public class exponent{

    public static double power(double x, int n){
        if(n != 0){ 
            return x*power(x, n-1);
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(power(3, 4));
    }
}