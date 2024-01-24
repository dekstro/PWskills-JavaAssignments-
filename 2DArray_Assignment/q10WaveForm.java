public class q10WaveForm {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        for(int j=0;j<n;j++){
            if (j%2==0) {
                for(int i=n-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int i=0;i<n;i++){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
