package LuckyVendingMachine;

public class Main {
    
    public static void main(String[] args) {
        
        boolean flag=true;
        
        do {
            Game player1 = new Game();
            
            switch (player1.inser_input()) {
               
                case 1:
                    System.out.println("case 1 ");
                    break;
                    
            
            
               
                case 2:
                    System.out.println("case 2 ");
                    break;
                    
               
                case 3:
                System.out.println("case 3 ");
                break;
                
               
                case 4:
                    System.out.println("case 4 ");
                    break;
                    
               
                case 5:
                System.out.println("case 5 ");
                flag=false;
                break;
                
                

                default:
                System.out.println("default");
                    break;
            }

            
            
        } while (flag);
        
    }
}
