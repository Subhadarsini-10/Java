import java.util.Scanner;

public class geometricSum {
    public static int sumFormK(int k, int a){
        if(k == 0){
            return 1;
        }
        a=a*2;
        return 1/a +sumFormK(k-1, a);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.println("Enter k");
            int k = s.nextInt();
            int a = 1;
            System.out.println(sumFormK(k, a));
    }
}

