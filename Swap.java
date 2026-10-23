public class Swap{
	public static void main(String[] args){
		int a=10,b=20;
		System.out.println("Value before swapping :"+" a:"+a+"\nb: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value after swapping :"+" a:"+a+"\nb: "+b);
	}
}