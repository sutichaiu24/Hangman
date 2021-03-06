
public class Game {
  private String answer;
  private String hits;
  private String misses ;
  public static final int MAX_MISSES = 8 ;
  public Game (String answer)
  {
	  this.answer = answer ;
	  hits ="";
	  misses = "";
	  
  }
  public int getRemainingTries()
  {
	  return MAX_MISSES-misses.length() ; 
  }
  
  public boolean applyGuess(char letter)
  {
	  boolean isHit = answer.indexOf(letter) != -1 ;
	  if (isHit)
	  {
		  hits += letter;
	  }else {
		  misses += letter ;
	  }
	  return isHit;
  }
  public String getAnswer()
  {
	  return this.answer;
  }
  public String getCurrentProgress()
  {
	  String progress ="" ;
	  for (char letter : answer.toCharArray())
	  {
		  char display ='-';
		  if (hits.indexOf(letter) != -1)
		  {
			  display = letter ;
		  }
		  progress += display;
	  }
	  return progress;
  }
}
