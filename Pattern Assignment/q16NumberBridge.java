public class q16NumberBridge {
    public static void main(String[] args) {
        int a=1;
        for (int i=1;i<=7;i++){
            System.out.print(a+" ");
            if (i>3) --a;
            else a++;
        }
        System.err.println();
        for (int i=1;i<=3;i++){
            for (int j=1;j<=4-i;j++){
                System.out.print(j+" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print(" "+" ");
            }
            for (int j=4-i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
