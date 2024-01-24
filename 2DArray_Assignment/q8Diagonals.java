public class q8Diagonals {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        int m=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i==j || (i+j)==m) {
                    System.out.print(arr[i][j]+" ");
                }
                else System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
