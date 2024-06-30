package Task1;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int randomNum = (int)(Math.random()*100)+1;
        boolean guessCorrectly = false;
        int noOfAttempts = 0;
        System.out.println("Guess the number between 1 to 100 :");
        // System.out.println("System generated number is :"+randomNum);
        while (!guessCorrectly && noOfAttempts < 5) {
            int userGuess = sc.nextInt();
            if(userGuess == randomNum)
                guessCorrectly = true;
            else
            {
                if(userGuess > randomNum)
                    System.out.println("Your guess is too high.");
                if(userGuess < randomNum)
                    System.out.println("Your guess is too low.");
                    
            }
        }
        sc.close();
        if(guessCorrectly)
             System.out.println("Congratulations! You guessed correctly! The number was " + randomNum);
        else  
            System.out.println("Sorry, you ran out of guesses. The correct answer was " + randomNum);

    }
}
