package assignment;

import java.util.Scanner;

public class totalsalary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bs = s.nextInt();
        String str = s.next();
        char c = str.charAt(0);
        int all;
        if(c == 65){
            all = 1700;
        }else if(c == 66){
            all = 1500;
        }else{
            all = 1300;
        }
        double ts = ((bs+(bs*0.2)+(bs*0.5)+all)-(bs*0.11));
        double p = Math.round(ts);
        int h = (int)(p);
        System.out.println(h);
    }
}
