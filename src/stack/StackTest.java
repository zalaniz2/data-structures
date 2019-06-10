package stack;

public class StackTest {

	public static void main(String[] args) {
		
		ArrayStack<Character> stack = new ArrayStack<Character>();
		String reverse = "sentence to be reversed.";
		String sentence = "";
				
		for( int i = 0; i<reverse.length(); i++) {
			
			char c = reverse.charAt(i);
			stack.push(c);
			
		}
		
		System.out.println("Original sentence: " + stack.toString());
				
		while( !stack.isEmpty() ) {
			sentence += stack.pop();
		}
		
		System.out.println("New sentence: " + sentence);
		
	}

}
