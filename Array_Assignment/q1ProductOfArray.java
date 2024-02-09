package Array_Assignment;

public class q1ProductOfArray {
    public static void main(String[] args) {
        int[] arr={5,4,7,8,5,9};
        int n=arr.length;
        int product=arr[0];
        for(int i=1;i<n;i++){
            product=product*arr[i];
        }
        System.out.println(product);
    }
}
