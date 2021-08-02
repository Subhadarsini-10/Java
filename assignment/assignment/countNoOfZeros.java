import java.util.Scanner;

public class countNoOfZeros {
    int count = 0;
    int count_digit(int num){
        if(num > 0){
            if(num % 10 ==0){
                count++;;
            }
            count_digit(num/10);
            
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n = s.nextInt();
        countNoOfZeros ob = new countNoOfZeros();
        System.out.println("The number of zeros in a number is:" + ob.count_digit(n));
        s.close();
    }
}
