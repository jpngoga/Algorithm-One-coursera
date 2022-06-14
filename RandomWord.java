import java.util.Random;

public class HangmanApp {

    /**
     * @param args the command line arguments
     */
    
    public String randomWord() {

        String theWord = null;

        //add more words if needed
        String[] wordList = { "computer", "horse", "queue", "banana", "exponential", "person" };
 
        Random rand = new Random();

        int randIndex = rand.nextInt (wordList.length);

        theWord = wordList [randIndex];

        return theWord;
        
    }
        
    public String myRandomWord;
      
      myRandomWord = randomWord();
      
    public static void main(String[] args) {
        // TODO code application logic here
      String myRandomWord;
      
      myRandomWord = randomWord();
      
      
      
    }
    
    
}
