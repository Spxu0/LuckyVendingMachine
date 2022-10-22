package LuckyVendingMachine;
import java.util.Scanner;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
public class Game {
    Scanner in=new Scanner(System.in);
    


    private String name;
    private int number;
    
    public void setNumber(int  number ) {
        
        this.number = number;
    }
    
    
    public int getNumber() {
        return number;
    }

 public void setName(String name) {


    if (this.name==null) {
        System.out.println("Enter your name ");
        this.name=in.nextLine();
    }
    
    else if (this.name!=null){
        System.out.println("you have been set up 1 or 2");
        String condition=in.nextLine().trim();
        if (condition.equalsIgnoreCase("1")) {
            System.out.println("Enter your name ");
            this.name=in.nextLine();
        }
        else if (condition.equalsIgnoreCase("2")){
            
        }
        else
        System.out.println("invalid input");
    }                           }
      
                



     
                                  
 









 public String getName() {
     return name;
 }
 
 
 










//display UI 
public void display(){
    if(name==null){
    System.out.println("\nWelcome to the Lucky Vending Machine\n"
    +"------------------------------------\n"
    +"(1) Set Up New Player\n"
    +"(2) Guess A Prize\n"
    +"(3) What Have I Won So Far?\n"
    +"(4) Display Game Help\n"
    +"(5) Exit Game\n"
    +"Choose an option :\n");
    }
else {
    System.out.println("\nWelcome "+name+" to the Lucky Vending Machine\n"
    +"------------------------------------\n"
    +"(1) Set Up New Player\n"
    +"(2) Guess A Prize\n"
    +"(3) What Have I Won So Far?\n"
    +"(4) Display Game Help\n"
    +"(5) Exit Game\n"
    +"Choose an option :\n");
}

}






}


