import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double cp,sp,profit,loss;
        System.out.print("Enter cost price:Rs ");
        cp=sc.nextDouble();
        System.out.print("Enter selling price:Rs ");
        sp=sc.nextDouble();
        profit=sp-cp;
        loss=cp-sp;
        if (sp>cp) {
            System.out.println("Profit of Rs "+profit);
        }
        else if (cp>sp) {
            System.out.println("Loss of Rs "+loss);
        }
        else{
            System.out.println("Break even");
        }
        sc.close();
    }
}
