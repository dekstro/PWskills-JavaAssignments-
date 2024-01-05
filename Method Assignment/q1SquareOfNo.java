import java.util.*;
public class q1SquareOfNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        q1SquareOfNo ob=new q1SquareOfNo();
        ob.square(n);
        sc.close();
    }
    void square(int a){
        int b;
        for(int i=1;i<=a;i++){
            b=i*i;
            System.out.println(b);
        }
    }
}
