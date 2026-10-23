import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class demoHashsets {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("Mango");
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Mango");
        System.out.println("Hashset: "+hs);

        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Mango");
        lhs.add("Apple");
        lhs.add("Banana");
        lhs.add("Mango");
        System.out.println("linkedHashset: "+lhs);

        
        TreeSet<String> ths=new TreeSet<>();
        ths.add("Mango");
        ths.add("Apple");
        ths.add("Banana");
        ths.add("Mango");
        System.out.println("TreeSet: "+ths);


        LinkedHashSet<Integer> Lhs=new LinkedHashSet<>();
        Lhs.add(56);
        Lhs.add(23);
        Lhs.add(4);
        Lhs.addFirst(3084);
        System.out.println("linkedHashset: "+Lhs);


        LinkedList<Integer> LL=new LinkedList<>();
        LL.add(56);
        LL.add(23);
        LL.add(4);
        LL.addFirst(3084);
        System.out.println("Peek the last element"+LL.peekLast());
        System.out.println("Peek the First element"+LL.peekFirst());
        System.out.println(Lhs);
        System.out.println("poll the last element"+LL.pollLast());
        // System.out.println("Pool the First element"+LL.poolFirst());
        System.out.println(Lhs);


        List<Integer> list=new ArrayList<>(Arrays.asList(2,4,5,6,7,2,6,7,8,5));
        System.out.println("Original list"+list);

        List<Integer> newlist=new ArrayList<>(new HashSet<>(list));
        System.out.println("List after removing duplicants :"+newlist);

        String sentance="This is training session, the training session is on java  java is high level programming language.";
        String[] arr=sentance.split(("\\s+"));
        HashSet<String> uniquewords=new HashSet<>();
        for(String word:arr){
            uniquewords.add(word.toLowerCase());
        }
        System.out.println(uniquewords);



        
    }
}
