package Merge_Sort;

public class q2Reversepairs {
    static int count;
    public static void reversepair(int[] a, int[] b){
        int i=0,j=0;
        while (i<a.length && j<b.length) {
             if((long)a[i]>(long)2*(long)b[j]){
                count=count+(a.length-i);
                j++;
            }
            else i++;
        }
    }
    public static void mergeSort(int[] arr){
        int n=arr.length;
        if(n==1) return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        for(int i=0;i<n/2;i++){
            a[i]=arr[i];
        }
        for(int i=0;i<n-n/2;i++){
            b[i]=arr[i+n/2];
        }
        mergeSort(a);
        mergeSort(b);
        reversepair(a,b);
        merge(a,b,arr);
    }
    public static void merge(int[] a, int[] b, int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if (a[i]<=b[j]) {
                c[k]=a[i];
                i++;
            }
            else{
                c[k]=b[j];
                j++;
            }
            k++;
        }
        while(j<b.length){
            c[k]=b[j];
            j++;
            k++;
        }
        while(i<a.length){
            c[k]=a[i];
            i++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr={80,10,70,30,60,40,50,20};
        count=0;
        mergeSort(arr);
        System.out.println(count);
    }
}
