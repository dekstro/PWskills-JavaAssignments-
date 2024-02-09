package Array_Assignment;

public class q3MinimumValueArray {
    public static void main(String[] args) {
        int[] arr={5,89,23,14,-9,-5,-6};
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
                min=Math.min(min, arr[i]);
        }
        System.out.print(min);
    }
}
