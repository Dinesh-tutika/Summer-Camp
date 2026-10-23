import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        int[] arr={3,6,9,0,2,3};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            sum =sum+arr[i];
        }
        System.out.println("sum of the numbers is "+sum);

        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(5);
        ar.add(9);
        ar.add(2);
        ar.add(1);
        ar.add(10);
        System.out.println(ar.get(0)); // 5
        System.out.println(ar.size()); // 5
        System.out.println(ar.remove(0));
        System.out.println(ar.isEmpty());

    }
}
