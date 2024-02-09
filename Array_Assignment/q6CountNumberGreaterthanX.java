package Array_Assignment;

import java.util.Scanner;

public class q6CountNumberGreaterthanX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter array: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter X: ");
        int x=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if (arr[i]>x) {
                count=count+1;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
