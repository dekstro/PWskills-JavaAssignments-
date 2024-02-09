package Array_Assignment;

public class q2SecondLargestArray {
    public static void main(String[] args) {
        int[] arr={45,96,256,48,35,15};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if (arr[i]>max) {
                max=Math.max(max, arr[i]);
            }
        }
        for(int i=0;i<n;i++){
            if (arr[i]!=max) {
                secmax=Math.max(secmax, arr[i]);
            }
        }
        System.out.println(secmax);
    }
}
