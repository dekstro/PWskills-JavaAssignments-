package Quick_Sort;

public class q3sort {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int[] arr, int low, int high){
        int mid=(high-low)/2+low;
        int pivot=arr[mid], pivotIdx=mid;
        int smallcount=0;
        for(int i=low;i<=high;i++){
            if(i==mid) continue;
            if(arr[i]<=pivot) smallcount++;
        }
        int correctIdx=low+smallcount;
        swap(arr, pivotIdx, correctIdx);
        int i=low, j=high;
        while(i<correctIdx && j>correctIdx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot) swap(arr, i, j);
        }
        return correctIdx;
    }
    public static void quicksort(int[] arr, int low, int high){
        if(low>=high) return;
        int idx=partition(arr,low,high);
        quicksort(arr, low, idx-1);
        quicksort(arr, idx+1, high);
    }
    public static void main(String[] args) {
        int[] arr={3,8,6,7,5,9,10};
        int n=arr.length;
        print(arr);
        quicksort(arr, 0, n-1);
        print(arr);
    }
}
