package Gcd;

import java.util.Scanner;

public class Gcd3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        getGcd(num1, num2);
    }

    public static void getGcd(int a, int b) {
        int i = 2;
        int gcd = 0;
        while(i <= b) {
            if(a % i == 0 && b % i == 0) {
                gcd = i;
            }
            i++;
        }
        System.out.println(gcd);
    }
}