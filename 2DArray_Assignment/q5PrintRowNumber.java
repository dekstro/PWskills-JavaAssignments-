public class q5PrintRowNumber {
    public static void main(String[] args) {
        int[][] arr={{1,3,4,6},{2,4,5,7},{3,5,6,8},{4,6,7,9}};
        int m=arr.length;
        int n=arr[0].length;
        int largest=0;
        for(int i=0;i<m;i++){
            int sum=0,temp=0;
            for(int j=0;j<n;j++){
                sum=sum+arr[i][j];
            }
            if(sum>temp){
                largest=i;
                temp=sum;
            } 
            
        }
        System.out.println(largest);
    }
}
