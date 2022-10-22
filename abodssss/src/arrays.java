package LuckyVendingMachine;
import java.util.ArrayList;

public class arrays {
    
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<String> priceWorth = new ArrayList<String>();
        ArrayList<String> costToPlayer = new ArrayList<String>();
        ArrayList<String> priceWon = new ArrayList<String>();
    
    arrays(){
       
    
          numbers.add(1);
          numbers.add(2);
          numbers.add(3);
          numbers.add(4);
          numbers.add(5);

        priceWon.add("Pen");
        priceWon.add("Book");
        priceWon.add("DVD");
        priceWon.add("Mouse");
        priceWon.add("Keyboard");
        
        priceWorth.add("$10");
        priceWorth.add("$20");
        priceWorth.add("$30");
        priceWorth.add("$40");
        priceWorth.add("$50");
        
        priceWon.

        costToPlayer.add("$1");
        costToPlayer.add("$2");
        costToPlayer.add("$3");
        costToPlayer.add("$4");
        costToPlayer.add("$5");
        
    }
    

    //
    public void displaytable (){
        System.out.println("what prize  would like to win by trying to guess that number. The rules are :\n"
        +"\n \nNumber Generated "+numbers 
        +"\n \nPrice Won "+priceWon
        +"\n \nPrice Worth "+priceWorth
        +"\n \nCost to playe "+costToPlayer
        +"\n \nguess number between 1-5\n");
        
    }
}