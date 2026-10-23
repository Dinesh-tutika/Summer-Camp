import java.util.InputMismatchException;
import java.util. Scanner;
public class ProblemExc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter the values of a and b");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c;
            c=a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("we canot divided by zero "+e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("Non numeric Inputs is "+e);
        }finally{
            System.out.println("Done");
        }
    }
}
