/*public class StringReverse{
public static void main(String args[]){
String str="Dinesh";
String rev=new StringBuilder(str).reverse().toString();
System.out.print(rev);

	}
}*/

import java.util.*;


public class StringReverse {
    public static void reverse(int[] arr, int i, int j){
        if(i>=j) return;
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverse(arr, i+1, j-1);
    }
    public static void main(String[] args) {
       int[] arr = {4,6,8,9,0};
       reverse(arr, 0, arr.length-1);
       for(int i:arr)
        System.out.print(i+"  ");
    }
}
/*import java.util.*;


public class Main {
    public static boolean palidrome(String p, int i, int j){
        if(i>=j) return true;
        if(p.charAt(i) != p.charAt(j)) return false;
        return palidrome(p, i+1, j-1);
    }
    public static void main(String[] args) {
      String s = "abccba";
      System.out.println(palidrome(s, 0, s.length()-1));
    }
}
 */
/*
    String pool = it will store the data with a single object of  duplicate varibles with the same value

eg :    str1="dinesh";  -----> it will strore and directly located to the dinesh
	Str2="dinesh"; ------>it will store the data with their location

	string is not a THREAD SAFE so we introduce STRING BUILDER
*/