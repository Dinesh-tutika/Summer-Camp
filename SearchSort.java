import java.util.ArrayList;
import java.util.Arrays;

public class SearchSort{
/*#############################################          LINEAR SEARCH        #################################################### */

//     public static int linearSearch(int[] arr,int target ){
//         int n=arr.length;
//         for (int i=0;i<n;i++){
//             if(arr[i]==target) return i;
//         }
//         return -1;
//     }
//     public static int lastOccurance(int[] arr,int target){
//         int n=arr.length;
//         int lastIndex=-1;
//         for(int i=0;i<n;i++){
//             if(arr[i]==target ) lastIndex=i;
//         }

//         return lastIndex;

//     }
// /*##########################################      BINARY SEARCH      ################################## */
    // public static int binarySearch(int[] arr,int targrt){
    //     int low=0;
    //     int high=arr.length-1;
    //     while (low<high) {
    //         int mid=(low+high)/2+1;
    //         if(arr[mid]==targrt) return mid;
    //         else if (arr[mid]<targrt) {
    //             high=mid+1;
    //         }else{
    //             low=mid;
    //         }
    //     }
    //     return -1;
    // }
    // public static int count(int[] arr,int target){
    //     int n=arr.length;
    //     int count=0;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]==target) count++;
    //     }
    //     return count;
    // }

// /* #########################################     BUBBLE SORT      ####################################*/ 
//     public static  void bubbleSort(int[] arr){
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             boolean swapped =false;
//             for(int j=0;j<n-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                     swapped=true;
//                 }
//             }
//         }
//     } 

/* #####################################      SELECTION SORT        ################################## */
    // public static void selectionSort(int[] arr){
    //     int n=arr.length;
    //     //increasing order
    //     // for(int i=0;i<n;i++){
    //     //     int min=i;
    //     //     for(int j=i+1;j<n;j++){
    //     //         if(arr[j]<arr[min]) min=j;
    //     //     }
    //     //     int temp=arr[min];
    //     //     arr[min]=arr[i];
    //     //     arr[i]=temp;
    //     // }
        
    //     //decesending order
    //     for(int i=0;i<n;i++){
    //         int min=i;
    //         for(int j=i+1;j<n;j++){
    //             if(arr[j]>arr[min]) min=j;
    //         }
    //         int temp=arr[min];
    //         arr[min]=arr[i];
    //         arr[i]=temp;
    //     }
    // }
/*##################################      INSERTION SORT       ###################### */
        // public static void insertionSort (int[] arr){
        //     int n=arr.length;
        //     for(int i=1;i<n;i++){
        //         int key=arr[i];
        //         int j=i-1;
        //         while (j>=0 && arr[j]>key) {
        //             arr[j+1]=arr[j];
        //             j--;
                    
        //         }
        //         arr[j+1]=key;

        //     }
        // }
/*################################          MERGE SORT        ############################# */
    // public static void mergeSort(int[] arr,int low,int mid,int high){
    //     int left=low,right=mid+1;
    //     ArrayList<Integer> list=new ArrayList<>();
    //     while (left<=mid && right<=high) {
    //         if(arr[left]<=arr[right]){
    //             list.add(arr[left]);
    //             left++;
    //         }else{
                
    //         }
            
    //     }
        
    // }
    public static void main(String[] args) {
        int[] arr={2,3,12,45,10,13,36,25};
        // System.out.println("The element 7 is at index "+linearSearch(arr,9));
        // System.out.println("The Last Occurance  of an index "+lastOccurance(arr, 11));
        // System.out.println("The count is "+count(arr, 10));
        // System.out.println("the binary sort"+binarySearch(arr,3));
        // bubbleSort(arr);
        // System.out.println(Arrays.toString(arr));
        // selectionSort(arr);
        // System.out.println(Arrays.toString(arr));
        // insertionSort(arr);
        // System.out.println(Arrays.toString(arr));
    }
}