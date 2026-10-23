import java.util.*;
public class Gessing {   
    public static void main(String[] args) {
       Random rand = new Random();
        int compGuess = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int attempt = 0;
        while(true){
            System.out.println("Welcome to number guessing game");
            while(true){
                System.out.println("guess a number between 1 to 100");
                int userGuess = sc.nextInt();
                attempt++;
                if(userGuess == compGuess){
                    System.out.println("congrats you guessed the number in "+attempt +" attemps");
                    break;
                }else if(userGuess > compGuess){
                    System.out.println("number is smaller");
                }else{
                    System.out.println("number is greater");
                }
            }   
            System.out.println("do you want to play again ?"); 
            System.out.println("Enter 1 to play again"); 
            System.out.println("Enter 0 to exit");
            int choise = sc.nextInt();
            if(choise == 0){
                System.out.println("thanks for playing");
                break;
            } 
        }
 
    }
}

