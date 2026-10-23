public class Minarray {
    public static void main(String[] args) {
        int arr[]={5,1,3,6,7,5,6};
        int min=arr[0];
        int max=arr[0];
        for(int i:arr){
            if(i<min){
                min=i;
            }else if(i>max){
                max=i;
            }
        }
        System.out.print(min+"  "+max);

    }
}
