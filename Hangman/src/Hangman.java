
public class Hangman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Game game = new Game ("treehouse");
       Prompter prompter = new Prompter(game);
       while (game.getRemainingTries()>0)
       { 
    	   prompter.displayProgress();
    	   prompter.promptForGuess();	
    	   if (game.getCurrentProgress().equals(game.getAnswer()))  
    		   {System.out.print("You win yes its:"+game.getAnswer());
    		   break;
    		   }
    	   
       }
    	 
       
   
	}
}