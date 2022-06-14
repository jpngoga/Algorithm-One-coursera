public class RndomString {

	public static void main(String[] args) {
	    
	    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String randomString = "";
	    
	    
	    Random rand = new Random();
	    int length = rand.nextInt(8);
	    
	    char[] text = new char[length];
	    
	    for(int i = 0; i < length; i++){
	        text[i] = characters.charAt(rand.nextInt(characters.length()));
	    }
	    
	    for(int i = 0; i < text.length; i++){
	        randomString += text[i];
	    }
	    System.out.println(randomString);
	    
		
	}
}
