package assignments;

import java.util.Scanner;

public class sumOrProduct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int choice = s.nextInt();
        int sum = 0, product = 1;
        for(int i = 1; i<=n; i++){
            if(choice == 1){
                sum = sum+i;
            }else if(choice == 2){
                product = product*i;
            }else{
                System.out.println(-1);
            }
        }
        System.out.println(sum);
        System.out.println(product);
    }
}
