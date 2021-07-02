package assignment;

public class numberOfDigits {

    public static int digits(int n){
        int count = 0;
        while(n != 0){
            n = n/10;
            ++count;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(digits(156));
    }
}
