package assignments;

import java.util.Scanner;

public class totalSalary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int basic = s.nextInt();
        String str = s.next();
        char c = str.charAt(0);
        int allow;
        if(c == 65){
            allow = 1700;
        }else if(c == 66){
            allow = 1500;
        }else{
            allow = 1300;
        }
        double ts = ((basic+(0.2*basic)+(0.5*basic)+allow)+(0.11*basic));
        double p = Math.round(ts);
        int h = (int)(p);
        System.out.println(h);
    }
}
