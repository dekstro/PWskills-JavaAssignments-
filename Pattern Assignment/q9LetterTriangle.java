public class q9LetterTriangle {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print((char)(64+j)+" ");
            }
            System.out.println();
        }
    }
}
