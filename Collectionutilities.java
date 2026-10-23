import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Collectionutilities {
    public static void main(String[] args) {
        
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,7,3,18,2,7,6,8));
        System.out.println(list);
        System.out.println("shuffled list"+list);
        //Collections.sort(list);
        //System.out.println(list);
        System.out.println("maxmimum element of the list"+Collections.max(list));
        System.out.println("minimum element of the list"+Collections.min(list));
        Collections.reverse(list);
        System.out.println("Reverse the list"+list);
        System.out.println("index of element 7 is:"+Collections.binarySearch(list,6));
        System.out.println();
       
        
    }
}
