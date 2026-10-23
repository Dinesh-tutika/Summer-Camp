public class RotateArray {
    public static void main(String[] args) {
        int arr[]={5,1,3,6,7,5,6};
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
