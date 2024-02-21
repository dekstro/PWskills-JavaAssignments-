package Recursion1;

public class q1sumofOddno {
    public static int odd(int a, int b){
        if(a==b) return a;
        return a+odd(a+2, b);
    }
    public static void main(String[] args) {
        System.out.println(odd(1, 11));
    }
}
