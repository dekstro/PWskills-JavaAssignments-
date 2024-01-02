import java.util.Scanner;

public class q4 {
    static void leapYear(int year){
        if(year%4==0) System.out.println("Leap Year");
        else if(year%100==0) System.out.println("Not a leap year");
        else if(year%400==0) System.out.println("Leap Year");
        else System.out.println("Not a leap year");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter year: ");
        int a=sc.nextInt();
        leapYear(a);
        sc.close();
    }
}
