public class q6MidIndex {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int n=arr.length;
        mid(arr, n);
    }
    static void mid(int[][] arr,int n){
        int start=0,end=n-1;
        int mid=start+(end-start)/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i==mid || j==mid) {
                    System.out.print(arr[i][j]+" ");
                }
                else System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
