public class Main1
{
	public static void main(String[] args) {
	    int a=60;
	    int b=130;
	    if (Math.abs(100-a)==Math.abs(100-b))
		System.out.println("Nutral");
	    else if(Math.abs(100-a)>Math.abs(100-b)) 
		System.out.println("a is the difference "+Math.abs(100-a)+"\tthe number is "+a);
	    else
		System.out.println("b is the difference "+Math.abs(100-b)+"\t the number is "+b);
	}
}