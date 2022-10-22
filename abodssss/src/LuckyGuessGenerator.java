package LuckyVendingMachine;
import java.util.Random;

import javax.lang.model.util.ElementScanner14;

public class LuckyGuessGenerator {

    

    Random random=new Random();

     private int randomNumber; 
    
    
    public int getRandomNumber() {
        return random.nextInt(1,6);
    }




// method to check  user input
    void checkNumber(int numberGuess){
        
        if (numberGuess<=5 & numberGuess>=1) {
            
            if (numberGuess==randomNumber)  {
                System.out.println("Congratulations! You have won a");        
                                            }
            else
            System.out.println("Sorry! You have won NOTHING! Please try again.");
        }

        else
        System.out.println("Error: your Guess must be between 1-5");
                                    }



}
