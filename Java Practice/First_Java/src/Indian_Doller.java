//Input currency in rupees and output in USD.

import java.util.*;
public class Indian_Doller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rupee , doller;
        System.out.println("Enter amount in rupees : ");
        rupee = sc.nextFloat();

        doller = 0.012 * rupee;

        System.out.println("Amount of " + rupee +" in doller is : "+doller);

    }
}
