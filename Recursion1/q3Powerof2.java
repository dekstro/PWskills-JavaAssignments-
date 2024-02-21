package Recursion1;

public class q3Powerof2 {
    public static boolean power(int n){
        if (n == 1) return true;
        else if (n % 2 != 0 || n == 0)
            return false;
        else
            return power(n / 2);
    }
    public static void main(String[] args) {
        int n=8;
        System.out.println(power(n));
    }
}
