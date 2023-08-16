//To find out whether the given String is Palindrome or not.

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "refer";
        String rstr="";
        char ch;

        for(int i=str.length()-1 ; i >= 0 ; i--){
            ch = str.charAt(i);
            rstr = rstr + ch;
        }
        if(str.equals(rstr)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }

    }
}
