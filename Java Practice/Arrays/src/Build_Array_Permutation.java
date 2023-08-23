//Build Array from Permutation
import java.util.*;

public class Build_Array_Permutation {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        int[] ans = buildArray(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] buildArray(int[] arr) {
        int[] ans = new int[arr.length];
        for(int i=0 ; i<arr.length ; i++){
            ans[i] = arr[arr[i]];
        }

        return ans;
    }
}
