//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.


import java.util.*;
public class Max_Three_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 , num2 , num3;
        System.out.println("Enter First nunber : ");
        num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        num2 = sc.nextInt();
        System.out.println("Enter third number : ");
        num3 = sc.nextInt();

        int ans = greatestOfThree(num1 , num2 , num3);
        System.out.println("The greatest number is : " + ans);

    }

    static int greatestOfThree(int num1, int num2, int num3) {
        if(num1>num2 && num1> num3){
            return num1;
        }
        else if(num2>num1 && num2>num3){
            return num2;
        }
        return num3;
    }
}
