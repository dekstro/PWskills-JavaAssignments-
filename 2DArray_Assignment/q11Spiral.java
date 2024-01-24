public class q11Spiral {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        int[][] ans=matrix(arr, n);
        for(int[] ele:ans){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    static int[][] matrix(int[][] arr,int n){
        ;
        int pos=1;
        int minr=0,maxr=n-1;
        int minc=0,maxc=n-1;
        while (minr<=maxr && minc<=maxc) {
            for(int j=minc;j<=maxc;j++){
                arr[minr][j]=pos++;
            }
            minr++;
            if(minr>maxr || minc>maxc) break;
            for(int i=minr;i<=maxr;i++){
                arr[i][maxc]=pos++;
            }
            maxc--;
            if(minr>maxr || minc>maxc) break;
            for(int j=maxc;j>=minc;j--){
                arr[maxr][j]=pos++;
            }
            maxr--;
            if(minr>maxr || minc>maxc) break;
            for(int i=maxr;i>=minr;i--){
                arr[i][minc]=pos++;
            }
            minc++;
        }
        return arr;
    }
}
