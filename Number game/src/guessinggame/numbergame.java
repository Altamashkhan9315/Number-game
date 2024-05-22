package altamash;
import java.util.*;

public class guessinggame {
	public static void guessing_game() {
		Random no = new Random();
        int randomnumber = no.nextInt(100);
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int guessednumber=sc.nextInt();
		int attempt =0;
		boolean result=false;
		while(guessednumber != randomnumber && attempt<=3){
		    
		    if(guessednumber==randomnumber){
		        result= true;
		        
		    }else if(guessednumber<randomnumber){
		    	attempt++;
		            System.out.println("You are lower");
		            System.out.print("Try Again : ");
		            guessednumber=sc.nextInt();
		            

		             
		    } else if (guessednumber>randomnumber){
		    	attempt++;
		            System.out.println("You are higher");
		            System.out.print("Try Again : ");
		            guessednumber=sc.nextInt();
		           
		            
		             
		    } 
		    
		        
		}if(result==true){
		    System.out.print("Congratulation u win in "+attempt+"attempt");
		}else{
		    System.out.println("Game over");
		}
	}
    public static void main(String[] args) {
        guessing_game();
        Scanner sc= new Scanner(System.in);
        System.out.print("Play Again : 1 or 0 : ");
        int playagain=sc.nextInt();
        int rounds=0;
        if(playagain==1) {
        	rounds++;
        	guessing_game();
        }else {
        	System.out.print("Have a nice day");
        }
        
        
    }
}
