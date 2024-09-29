import java.util.Scanner;
import java.lang.Math;

public class GuessingGame {
    public static void main(String[] args){

        int answer= (int)(Math.random()*100)+1;
        int k=5;
        Scanner input= new Scanner(System.in);

        boolean correct=false;
        System.out.println("Think of a number between 1 to 100.\nYou have only 5 chances to guess the number");
        while (k>0){
            System.out.println("Enter you guess: ");
            int guess=input.nextInt();

            if(guess==answer){
                System.out.println("You have guessed the correct number.\n you win!!");
                break;
            } else if (guess>answer) {
                System.out.println("Your guess is too high. You have "+(k-1)+"chances left");
                k--;
            }

            else{
                System.out.println("Your guess is too low.\n You have  "+(k-1)+"chances left.");
            }
            k--;

        }
        if(correct==false){
            System.out.println("You have no attempts left.\n Better luck next time ");
        }
    }
}
