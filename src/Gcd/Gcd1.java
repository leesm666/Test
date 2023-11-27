package Gcd;

// 최대 공약수 
public class Gcd1 {
    public static void main(String[] args) {


        int num1 = 403;
        int num2 = 155;

        int i = 2;
        int gcd =0;
        while(i <= num2) {
            if(num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        System.out.println(gcd);
    }
    
   
}

