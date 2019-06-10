package stack;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MazeTester {
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the name of the file with maze: ");
		String filename = scan.nextLine();
		
		Maze lab = new Maze(filename);
		
		System.out.println(lab.toString());
		
		MazeSolver solver = new MazeSolver(lab);
		
		if( solver.traverse()) {
			System.out.println("Successfully traversed.");
			scan.close();
			
		}
		else {
			System.out.println("No possible path..");
			scan.close();
		}
		System.out.println(lab.toString());

		
		
	}

}
