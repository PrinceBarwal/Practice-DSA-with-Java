// Take 2 numbers as inputs and find their HCF and LCM.

import java.util.*;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gcd = 1;
        int lcm = 0;
        int num1 , num2;
        System.out.print("Enter first number : ");
        num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        num2 = sc.nextInt();
        int min = (num1>num2) ? num2 : num1;
        for(int i=1 ; i<min ; i++){
            if(num1%i == 0 && num2%i == 0){
                gcd = i;
            }
        }
        lcm = (num1*num2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);

    }
}
