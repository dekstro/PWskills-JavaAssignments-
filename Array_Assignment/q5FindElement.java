package Array_Assignment;

import java.util.Scanner;

public class q5FindElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter array: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int small=1;
        System.out.println("Index are");
        for(int i=0;i<n;i++){
            if (arr[i]==small) {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
