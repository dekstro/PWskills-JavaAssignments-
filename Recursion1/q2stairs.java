package Recursion1;

import java.util.Scanner;

public class q2stairs {
    public static int stair(int n){
        if(n<=3 && n!=0) return n;
        return stair(n-1)+stair(n-2)+stair(n-3);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println(stair(n));
        sc.close();
    }
}
