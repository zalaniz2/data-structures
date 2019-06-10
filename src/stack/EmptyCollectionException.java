package stack;

/**
 * Situation handle for when collection is empty.
 * 
 * @author Zach Alaniz (ref. Java Software Structures 4th edition)
 *
 */

public class EmptyCollectionException extends RuntimeException{
	
	public EmptyCollectionException(String collection) {
		super("The " + collection + " is empty.");
	}

}
