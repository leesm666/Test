package Gcd;

import java.util.Scanner;

public class Gcd4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(gcd(num1, num2));
    }

    // 유클리드 호제법
    public static int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b, a % b); // 재귀 else 생략
    }
}
