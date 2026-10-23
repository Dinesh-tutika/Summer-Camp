public class Calculator{
	public static void main(String[] args){
		int a=5,b=6;
		System.out.println("Cal Menu");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		int exp=1;
		switch(exp){
			case 1:System.out.println("Addition of a & b  "+(a+b));break;
			case 2:System.out.println("Subtraction of a & b  "+(a-b));break;
			case 3:System.out.println("Multiplication of a & b  "+(a*b));break;
			case 4:System.out.println("Division of a & b  "+(a/b));break;
		}
	}
}