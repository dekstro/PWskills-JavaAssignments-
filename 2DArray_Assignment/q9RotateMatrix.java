public class q9RotateMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int start=0,end=n-1;
            while(start<end){
                int temp=arr[start][i];
                arr[start][i]=arr[end][i];
                arr[end][i]=temp;
                start++;
                end--;
            }
        }
        for(int[] ele:arr){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        } 
    }
}
