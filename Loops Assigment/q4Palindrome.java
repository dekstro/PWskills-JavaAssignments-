import java.util.Scanner;

public class q4Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int temp=n;
        int ld,rev=0;
        while (temp!=0) {
            ld=temp%10;
            rev=rev*10+ld;
            temp=temp/10;
        }
        if (n==rev) {
            System.out.println("Palindrome");
        }
        else System.out.println("Not palindrome");
        sc.close();
    }
}
