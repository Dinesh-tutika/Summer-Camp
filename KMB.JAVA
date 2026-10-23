import java.util.Scanner;
public class KMB
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    long a=sc.nextLong();
	    if (a<10000) System.out.println("10k");
	    else if(a>=10000 && a<100000){
	        System.out.println((a/100)/10.0+"k");
	    }else if(a>=100000 && a<1000000){
	        System.out.println((a/1000)+"k");
	    }else if(a>=1000000&&a<10000000){
	        System.out.println((a/100000)/10.0+"M");
	    }else if(a>=10000000&&a<1000000000){
	        System.out.println((a/1000000)+"M");
	    }else //if(a>=1000000000&&a<10000000000)
	    {
	        System.out.println((a/100000000)/10.0 +"B");
	    }	    
	}
}