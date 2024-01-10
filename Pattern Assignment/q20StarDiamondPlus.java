public class q20StarDiamondPlus {
    public static void main(String[] args) {
        int n=6;
        for (int i = 1; i < n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int spaces = 0; spaces < 2 * (i - 1) - 1; spaces++) {
                if(spaces == (2 * (i - 1) - 1) / 2) System.out.print("*");
                else System.out.print(" ");
            }
            if(i != 1) System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < 2 * n - 1; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k < 2 * (n - i) - 2; k++) {
                if(k == (2 * (n - i) - 2) / 2) System.out.print("*");
                else System.out.print(" ");
            }
            if(i != n - 1) System.out.print("*");
            System.out.println();
        }
    }
}
