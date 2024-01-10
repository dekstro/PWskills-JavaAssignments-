public class q19NumberArrow {
    public static void main(String[] args) {
        int a=1,b=2;
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4-i;j++){
                System.out.print(" "+" ");
            }
            for (int j=1;j<=1;j++){
                System.out.print(a+" ");
                a++;
            }
            for (int j=1;j<=2*i-3;j++){
                System.out.print(" "+" ");
            }
            for (int j=1;j<=i-1;j++){
                System.out.print(b+" ");
                b++;
                if(i==3) break;
                if(i==4) break;
                if(i==5) break;
            }
            System.out.println();
        }
    }
}
