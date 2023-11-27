package Gcd;

import java.util.Scanner;

public class Gcd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int i = 2;
        int gcd = 0;
        while(i <= num2) {
            if(num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        System.out.println(gcd);
    }
}
