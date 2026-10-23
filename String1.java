import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(c>=47&& c<=57){
            System.out.println("it is the number"+c);
        }else if(c>='a'&&c<='z'){
            System.out.println("it is the small alphabet "+c);
            c=(char)(c-32);
            System.out.println("it is the small alphabet to Capital "+c);
        }else if (c>='A'&&c<='Z') {
            System.out.println("it is the Capital letter "+c);
            c=(char)(c+32);
            System.out.println("it is the Capital small alphabet "+c);
        }else{
            System.out.println("it is the symbol "+c);   
        }
    }
}
