import java.util.*;
class BankAccount{
    public static String BankName="BITS_BANK";
    public static String ifscCode="IBN23445UL";
    public String name;
    public int balance;
    public int atm_pin;
    public long phoneNo;
    public int accountNo;
    public String id;
    public ArrayList<String> passBook;
    public BankAccount(String nam,long ph,String idNo){
        name=nam;
        phoneNo=ph;
        id=idNo;
        balance=0;
        accountNo=Main.generateAccountNo(ph,nam);
        atm_pin = accountNo%10000;
        passBook=new ArrayList<>();
        System.out.println("dear "+name+" ,your bank account has been successfully created in bits bank and your account number is"+accountNo);
    }
    public void deposit(int money,int accNo){
        if(accountNo==accNo) {
            balance+=money;

            passBook.add(money+" created");
        }else{
            System.out.println("incorrect account number");
        }
    }
    public void CheckBalance ( int accNo){
        if(accountNo==accNo){
            System.out.println("dear "+name+"Your Balance is "+balance);
        }else{
            System.out.println("incorrect account number");
        }
    }
    public void withDraw_ATM(){
        System.out.println("please insert your debit card");
        System.out.println("Enter your pin");
        Scanner sc  = new Scanner(System.in);
        if(sc.nextInt() == atm_pin){
            System.out.println("Enter the amount");
            int amount = sc.nextInt();
            if(balance >= amount){
                balance -= amount;
                passBook.add(amount + "debited");
                System.out.println("do you want to display your balance enter 1 for yes 0 for exit");
                if(sc.nextInt() == 1){
                    System.out.println("your account balance is " + balance);
                }else{
                    System.out.println("thanks for using this atm");
                }
                System.out.println("please take your cash and card");
            }else{
                System.out.println("insufficient balance");
            }
        }else{
            System.out.println("something went wrong");
        }
        sc.close();
    }
    /*public void bankTransfer(int money,BankAccount friendAccount){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your account no");
        if (accountNo==sc.nextInt()) {
            if (money<=balance) {
                balance-=money;
                friendAccount.balance+=money;
                passBook.add(money+"debited");
                friendAccount.passBook.add(money+"credited");
                System.out.println("dear "+name+" "+money+" debited");
            }
        }
    }
*/

}
public class Main{
    public static int generateAccountNo(long ph,String nam){
        int last6=(int)(ph%1000000);
        int asciSum=0;
        for(int i=0;i<nam.length();i++){
            asciSum+=nam.charAt(i);
        }
        return last6+asciSum+561;
    }
    public static void main(String[] args) {
        BankAccount acc1=new BankAccount("Dinesh", 6304385247L, "12345670");  
        acc1.deposit(10000,386411 ); 
        acc1.withDraw_ATM();
        
    }
}
/* import java.util.*;


class BankAccount {
    public static String BankName = "BITS_Bank";
    public String name;
    public int accountNo;
    public int balance;
    public int atm_pin;
    public long phoneNo;
    public static String ifscCode = "IBN23445UL";
    public String id;
    public ArrayList<String> passBook;


    public BankAccount(String nam, long ph, String idNo) {
        name = nam;
        phoneNo = ph;
        id = idNo;
        balance = 0;
        accountNo = Main.generateAccountNo(ph, nam);
        passBook = new ArrayList<>();
        // System.out.println("dear " + name + ", your bank account has been created successfull in Bits Bank your account number is " + accountNo);
        atm_pin = accountNo%10000;
    }
    public void deposit(int money,int accNo){
        if(accountNo == accNo){
            balance += money;
            passBook.add(money + " credited");
            System.out.println(money + " credited successfully");
        }else{
            System.out.println("incorrect account number");
        }
    }
    public void checkBalance(int accNo){
        if(accountNo == accNo){
            System.out.println("dear " + name +" your account balance is "+balance);
        }else{
            System.out.println("incorrect account number");
        }
    }
    public void withDraw_ATM(){
        System.out.println("please insert your debit card");
        System.out.println("Enter your pin");
        Scanner sc  = new Scanner(System.in);
        if(sc.nextInt() == atm_pin){
            System.out.println("Enter the amount");
            int amount = sc.nextInt();
            if(balance >= amount){
                balance -= amount;
                passBook.add(amount + "debited");
                System.out.println("do you want to display your balance enter 1 for yes 0 for exit");
                if(sc.nextInt() == 1){
                    System.out.println("your account balance is " + balance);
                }else{
                    System.out.println("thanks for using this atm");
                }
                System.out.println("please take your cash and card");
            }else{
                System.out.println("insufficient balance");
            }
        }else{
            System.out.println("something went wrong");
        }
        sc.close();
    }
    public void bankTransfer(int money, BankAccount friendsAccount){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your account no");
        if(accountNo == sc.nextInt()){
            if(money <= balance){
                balance -= money;
                friendsAccount.balance +=money;
                passBook.add(money + "debited");
                friendsAccount.passBook.add(money + " credited");
                System.out.println("dear " + name +"  "
                    + money + " debited");
            }else{
                System.out.println("insufficient balance");
            }
        }else{
            System.out.println("incorrect account number");
        }
    }
    public void displayPassBook(){
        for(int i = 0;i<passBook.size();i++){
            System.out.println(passBook.get(i));
        }
    }
}
public class Main {
    public static int generateAccountNo(long ph, String nam) {
        int last6 = (int) (ph % 1000000);
        int asciSum = 0;
        for (int i = 0; i < nam.length(); i++) {
            asciSum += nam.charAt(i);
        }
        return last6 + asciSum + 562;
    }
    public static void main(String[] args) {
       BankAccount acc1 = new BankAccount("kailash", 9898989898L, "345hj2k3");
       BankAccount acc2 = new BankAccount("rahul", 9898989898L, "345hj2k3");
       acc1.deposit(10000, 991193);
       acc1.bankTransfer(5500, acc2);
       acc1.checkBalance(991193);
    }
}
 */