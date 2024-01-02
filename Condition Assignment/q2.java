import java.util.*;
public class q2 {
    static int absoulteValue(int n){
        if(n<0) return -n;
        else return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=sc.nextInt();
        System.out.println(absoulteValue(a));
        sc.close();
    }
}
