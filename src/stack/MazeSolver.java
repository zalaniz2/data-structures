package stack;

import java.util.Deque;
import java.util.LinkedList;

public class MazeSolver {
	
	private Maze maze;
	
	public MazeSolver(Maze maze) {
		this.maze = maze;
	}
	
	public boolean traverse() {
		boolean done = false;
		int row, column;
		Position pos = new Position(0, 0);
		
		Deque<Position> stack = new LinkedList<Position>();
		stack.push(pos);
		
		while(!(done) && !stack.isEmpty()) {
			pos = stack.pop();
			maze.tryPosition(pos.getX(), pos.getY());
			
			if( pos.getX() == maze.getRows()-1 && pos.getY() == maze.getColumns()-1) {
				done = true;
			}
			else {
				push_new_pos(pos.getX() - 1, pos.getY(), stack);
				push_new_pos(pos.getX() + 1, pos.getY(), stack);
				push_new_pos(pos.getX(), pos.getY() - 1, stack);
				push_new_pos(pos.getX(), pos.getY() + 1, stack);
				
			}
		}
		return done;
		
		
	}
	
	public void push_new_pos(int x, int y, Deque<Position> stack) {
		
		Position npos = new Position(0, 0);
		npos.setX(x);
		npos.setY(y);
		
		if( maze.validPosition(x, y)) {
			stack.push(npos);
		}
		
	}

}
