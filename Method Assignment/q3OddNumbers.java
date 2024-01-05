import java.util.*;
public class q3OddNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The odd numbers are");
        q3OddNumbers ob=new q3OddNumbers();
        ob.odd(a, b);
        sc.close();
    }
    void odd(int x,int y){
            for(int i=x;i<=y;i++){
                if(i%2!=0) System.out.println(i);
            }
        }
}
