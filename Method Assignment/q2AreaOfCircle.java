import java.util.*;;
public class q2AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r=sc.nextInt();
        q2AreaOfCircle ob=new q2AreaOfCircle();
        System.out.println("Area of Circle is "+ob.area(r));
        sc.close();
    }
    double area(int x){
        double a;
        a=3.14*x*x;
        return a;
    }
}
