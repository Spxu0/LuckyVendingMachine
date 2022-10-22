package LuckyVendingMachine;
import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicDesktopIconUI.MouseInputHandler;
public class Main {
    public static void main(String[] args) {
        
        arrays abod=new arrays();
        Game player = new Game();
        LuckyGuessGenerator rand=new LuckyGuessGenerator();
        Scanner in=new Scanner(System.in);
        

        boolean flag=true;
       

        do {
            
            player.display();
            
           
            switch(in.nextInt()){
            
            
        case 1:
            
            player.setName(in.nextLine());
            
            break;
            
            
    
    
       
        case 2:
        abod.displaytable();
        rand.getRandomNumber();
        rand.checkNumber(in.nextInt());

            break;
            
       
        case 3:
       
        System.out.println();
        break;
        
       
        case 4:
            System.out.println("case 4 ");
            break;
            
       
        case 5:
        System.out.println("case 5 ");
        flag=false;
        break;
        
        

        default:
        System.out.println("Erorr : you must Choose number between 1 and 5 ");
            break;
    }

        } while (flag);
        System.out.println("good bey");
    }
    
}
