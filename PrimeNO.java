import java.util.*;
public class PrimeNO{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		Boolean isPrime=true;
		if(n<=1){
			isPrime=false;
		}else{
			for(int i=2;i<n;i++){
				if(n%i==0){
					isPrime=false;
					break;
				}
			}	
		}
		if(isPrime){	
			System.out.println(n+" is prime");
		}else{
			System.out.println(n+ "is not a prime");
		}
	}
}