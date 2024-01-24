public class q1elements {
    public static void main(String[] args) {
        int[][] arr=new int[5][5];
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=10;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
