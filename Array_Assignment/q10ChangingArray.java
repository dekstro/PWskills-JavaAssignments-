package Array_Assignment;

public class q10ChangingArray {
    public static void print(int[] arr){
       for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println(); 
    }
    public static void main(String[] args) {
        int[] arr={5,7,2,1,6,3,4};
        print(arr);
        for(int i=0;i<arr.length;i++){
            if (i%2==1) {
                arr[i]=arr[i]*2;
            }
            else{
                arr[i]=arr[i]+10;
            }
        }
        print(arr);
    }
}
