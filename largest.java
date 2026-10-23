import java.util.Scanner;
public class largest
{
	public static void main(String[] args) {
	    int a,b,c;
	    Scanner sc=new Scanner(System.in);
	    a=sc.nextInt();
	    b=sc.nextInt();
	    c=sc.nextInt();
	    if(a>b&&a>c){
	        System.out.print("a is large number "+a);
	    }else if(b>a&&b>c) System.out.print("b is large number "+b);
	    else System.out.print("c is grater "+c);
	}
}