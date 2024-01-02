import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a<b){
            if(a<c) System.out.println(a+" is smallest");
            else System.out.println(c+" is smallest");
        }
        else{
            if(b<c) System.out.println(b+" is smallest");
            else System.out.println(c+" is smallest");
        }
        sc.close();
    }
}
