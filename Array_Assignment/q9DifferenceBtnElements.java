package Array_Assignment;

public class q9DifferenceBtnElements {
    public static void main(String[] args) {
        int[] arr={5,7,2,1,6,3,4};
        int evensum=0,oddsum=0,diff;
        for(int i=0;i<arr.length;i++){
            if (i%2==0) {
                evensum=evensum+arr[i];
            }
            else{
                oddsum=oddsum+arr[i];
            }
        }
        diff=evensum-oddsum;
        System.out.println(diff);
    }
}
