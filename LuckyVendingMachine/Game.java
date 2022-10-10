package LuckyVendingMachine;
import java.util.Scanner;
public class Game {

private String player_Name;
private int user_Input;
//user input
public int inser_input(){
    Scanner input = new Scanner(System.in);
        this.user_Input=input.nextInt();
        return user_Input; 
    
}

//setter and getter
public void setPlayer_Name(String player_Name) {
    this.player_Name = player_Name;
}public void setUser_Input(int user_Input) {
    this.user_Input = user_Input;
}public String getPlayer_Name() {
    return player_Name;
}public int getUser_Input() {
    return user_Input;
}

//display method
public  void display_Information(){
    System.out.println("Welcome to the Lucky Vending Machine");
    System.out.println("------------------------------------");
    System.out.println("------------------------------------");
    System.out.println("(1) Set Up New Player");
    System.out.println("(2) Guess A Prize");
    System.out.println("(3) What Have I Won So Far?");
    System.out.println("(4) Display Game Help");
    System.out.println("(5) Exit Game");
    System.out.println("Choose an option :");
}
    

}

