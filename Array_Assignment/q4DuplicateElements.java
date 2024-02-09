package Array_Assignment;

public class q4DuplicateElements {
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,6,8};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (arr[i]==arr[j]) {
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
