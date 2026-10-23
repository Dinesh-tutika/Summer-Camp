import java.util.Scanner;
public class Main2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
System.out.println("enter a  number");
		int a=sc.nextInt();
		if(a>0) System.out.println("the number is"+a+" positive ");
		else if(a<0) System.out.println("the number is"+a+" negative ");
		else System.out.println("the number"+a+"zero");
	}
}

