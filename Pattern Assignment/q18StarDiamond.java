public class q18StarDiamond {
    public static void main(String[] args) {
        for (int i=1;i<=3;i++){
            for (int j=1;j<=4-i;j++){
                System.out.print(" "+" ");
            }
            for (int j=1;j<=1;j++){
                System.out.print("*"+" ");
            }
            for (int j=1;j<=2*i-3;j++){
                System.out.print(" "+" ");
            }
            for (int j=1;j<=i-1;j++){
                System.out.print("*"+" ");
                if(i==3) break;
            }
            System.out.println();
        }
        for (int i=1;i<=4;i++){
            for (int j=1;j<=7;j++){
                if (i==j || (i+j)==8) {
                    System.out.print("*"+" ");
                }
                else System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
