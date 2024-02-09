package Array_Assignment;

import java.util.Arrays;

public class q7LargestThree {
    public static void main(String[] args) {
        int[] arr={47,69,89,25,20,15,100,45};
        int n=arr.length;
        Arrays.sort(arr);
        System.out.println(arr[n-1]+" "+arr[n-2]+" "+arr[n-3]);
    }
}
