import java.util.*;

public class SessionThree {
    public static void main(String[] args) {
        // Stack<Integer> st=new Stack<>();
        // st.push(10);
        // st.push(20);
        // st.push(30);
        // st.push(40);
        // st.push(50);
        // System.out.println(st);
        // int size=st.size();
        // System.out.println(size);
        // st.push(60);
        // System.out.println(st);
        // System.out.println(st.pop());
        // System.out.println(st);
        // System.out.println(st.empty());
        // System.out.println(st.isEmpty());


        Stack<String> ss=new Stack<>();
        ss.push("Dinesh");
        ss.push("Shyam");
        ss.push("kannaiah");
        ss.push("abhi");
        System.out.println(ss);
        Stack<String> s1=new Stack<>();
        // if(ss.empty())
        for(int i=0;i<=ss.size()+1;i++){
            s1.push(ss.pop());

        }
        s1.push(ss.pop());
        System.out.println(s1);

        











        // Deque<Integer> dq=new ArrayDeque<>();
        // dq.push(100);
        // dq.add(200);
        // dq.push(300);
        // dq.push(400);
        // dq.add(500);
        // System.out.println(dq);





    }
}
