public class q15LetterBridge {
    public static void main(String[] args) {
        for (int i=1;i<=7;i++){
            System.out.print((char)(i+64)+" ");
        }
        System.out.println();
        for (int i=1;i<=3;i++){
            int a=1;
            for (int j=1;j<=4-i;j++){
                System.out.print((char)(a+64)+" ");
                a++;
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print(" "+" ");
                a++;
            }
            for (int j=5;j<=8-i;j++){
                System.out.print((char)(a+64)+" ");
                a++;
            }
            System.out.println();
        }
    }
}
