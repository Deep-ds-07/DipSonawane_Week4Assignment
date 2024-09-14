package week4_Q3;
// Custom Exception Class for Invalid Input
public class InvalidInputException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5211445094293987172L;

	public InvalidInputException(String message) {
        super(message);  
    }
}
