public class q22StarPattern {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            System.out.print("*"+" ");
        }
        System.out.println();
        for(int i=1;i<=3;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=4-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=2;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print("*"+" ");
            }
            for (int j=3;j>=2*i-1;j--){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i+1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=7;i++){
            System.out.print("*"+" ");
        }
    }
}
