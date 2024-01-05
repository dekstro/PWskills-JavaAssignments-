import java.util.*;
public class q4CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        q4CountDigits ob=new q4CountDigits();
        System.out.println("Square of Digits is: "+ob.square(n));
        sc.close();
    }
    int square(int x){
        int count=0;
        while(x!=0){
            x=x/10;
            count++;
        }
        System.out.println("No of Digits is: "+count);
        int res=count*count;
        return res;
    }
}
