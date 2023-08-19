//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
import java.util.*;
public class Calculate_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        System.out.println("Enter radius of circle : ");
        radius = sc.nextDouble();
        double circum = circumference(radius);
        System.out.println("Circumference of corcle is : "  +circum);

        double area = circle_area(radius);
        System.out.println("Area of circle is : " +area);
    }

    static double circle_area(double radius) {
        double ans = 2 * 3.4 * radius;
        ans = ans * Math.pow(10 , 3);
        ans = Math.floor(ans);
        ans = ans / Math.pow(10,3);
        return (ans);

    }

    static double circumference(double radius){
        double ans = 3.14 * radius * radius;
        ans = ans * Math.pow(10 , 3);
        ans = Math.floor(ans);
        ans = ans / Math.pow(10,3);
        return (ans);
    }



}
