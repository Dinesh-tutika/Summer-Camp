import java.io.FileReader;
import java.io.IOException;

public class ExpHandling {
/***************************************RUNTIME EXCEPTION   USING  THROW(KEYWORD)0************************************ */    
    /*******CHECK AGE PROGRAM************ */
    // public static void checkAge(int age){
    //     if(age<0){
    //         throw new RuntimeException("Age cannot bePUBLIC  less than zero");
    //     }else{
    //         System.out.println("Age  is valid");
    //     }
    // }
    /********* BALANCE CHECKING************* */
    // public static void balancecheck(float bal){
    //     if(bal<0){
    //         throw new RuntimeException("The balance is not less then zero");
    //     }else{
    //         System.out.println("the balance is "+bal);
    //     }
    // }
    // IO EXCEPTION
    public static void readFile() throws IOException{
        FileReader fr=new FileReader("file .txt");
        System.out.println("File opened successfully");
        fr.close();
    }
    
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Caught Exception"+e.getMessage());
        }

        // try {
        //     checkAge(18);
        // } catch (RuntimeException e) {
        //     System.out.println("This wont run");
        // }finally{
        //     System.out.println("the code is excuted ");
        // }

        // try {
        //     checkAge(-12);
        // } catch (Exception e) {
        //     System.out.println("caught exception "+e.getMessage());
        // }

        // try {
        //     balancecheck(55000.55f);
        // } catch (RuntimeException e) {
        //     System.out.println("This wont run");
        // }
        // try {
        //     balancecheck(-1200);
        // } catch (Exception e) {
        //     System.out.println("caught exception "+e.getMessage());
        // }


    /********ARTHMETIC EXCEPTION************ */
        // int a=0,c;
        // String s=null;
        // try {
        //     c=10/a;
        //     System.out.println(c);
        // } catch (ArithmeticException e) {
        //     //System.out.println("the 0 is not divisible by 10");
        //     System.out.println(e.getMessage());
        // }finally{
        //      System.out.println("Finally block of code");
        // }
    // /*********NULL POINTER EXCEPTION********* */
       
    //    try {
    //         System.out.println("Length of the String is"+s.length());
    //    } catch (NullPointerException e) {
    //         System.out.println("String is null"+e.getMessage());
    //    }finally{
    //         System.out.println("Finally block of code");
    //    }
    // /******** ARRAY OUT OF THE BOUND EXCEPTION************* */
    //    try {
    //         int[] arr=new int[10];
    //         System.out.println(arr[15]);
    //    }catch (StringIndexOutOfBoundsException e) {
    //         System.out.println(e.getMessage());
    //    }finally{
    //         System.out.println("Finally block of code");
    //    }
    //    try {
    //         c=10/a;
    //         System.out.println(c);
    //         System.out.println("Length of the String is"+s.length());
    //         int[] arr=new int[10];
    //         System.out.println(arr[15]);
    //    } catch (Exception e) {
    //         System.out.println(e.getMessage());
    //    }
    //    finally{
    //     System.out.println("the program is completed successfully");
    //    }
         




    }
}
