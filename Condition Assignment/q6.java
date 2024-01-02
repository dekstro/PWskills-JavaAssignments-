import java.util.Scanner;

public class q6 {
    static void traingle(int x,int y,int z){
        if(x==y && y==z) System.out.println("Equilateral triangle");
        else if(x==y || y==z || x==z) System.out.println("Isosceles");
        else System.out.println("Scalene");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three sides of a triangle: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        traingle(a,b,c);
        sc.close();
    }
}
