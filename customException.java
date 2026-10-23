class AgeException1 extends Exception{
    AgeException1(String msg)  {
        super(msg);
    }
}
class NegativeException1 extends Exception{
    NegativeException1(String msg){
        super(msg);
    }
}
public class customException{
    static void checkAge(int age) throws AgeException1{
        if(age<18) {
            throw new AgeException1("the age must be above 18");
         }
    }
    static void checkNeg(int number) throws NegativeException1{
        if(number<0){
            throw new NegativeException1("The number is negative integer");
        }
        System.out.println("it is the negative number"+number);
    }

    public static void main(String[] args){
        try{
            checkAge(15);
        }catch(AgeException1 e){
            System.out.println("Catch age exception"+e.getMessage());
        }
        try{
            checkAge(34);
        }catch(AgeException1 e){
            System.out.println("it wont enter her");
        }
        try{
            checkNeg(10);
        }catch(NegativeException1 e){
            System.out.println("caught negative number"+e.getMessage());
        }
        try{
            checkNeg(-3);
        }catch(NegativeException1 e){
            System.out.println("Caught negative exception"+e.getMessage());
        }
    }
}