package BasicSorting_Assignment;

public class q5CheckSorting {
    public static void main(String[] args) {
        int[] arr={48,89,100,256,566};
        int n=arr.length;
        boolean flag=false;
        for(int i=0;i<n-1;i++){
            if (arr[i]<arr[i+1]){
                flag=true;
            }
            else{
                flag=false;
                break;
            }
        }
        if (flag==true) System.out.println("Sorted Array");
        else System.out.println("Unsorted Array");
    }
}
