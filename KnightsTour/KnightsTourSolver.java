/**
 *
 * @author nbreems
 * 
 */
public class KnightsTourSolver {

    static public boolean solveKnightsTour(KnightsTourBoard board, int x, int y, int num) {
    	if(num > board.getBoardSize() * board.getBoardSize())
    		return true;
    	
        int[][] moves = {new int[]{x+2,y-1},new int[]{x-1,y-2},new int[]{x-2,y+1},new int[]{x-2,y-1},
        		new int[]{x+1,y+2},new int[]{x+1,y-2},new int[]{x+2,y+1},new int[]{x-1,y+2}};
        
        
        for(int m = 0; m < moves.length; m++){
        	if(moves[m][0] >= 0 && moves[m][0] < board.getBoardSize() &&
        			moves[m][1] >= 0 && moves[m][1] < board.getBoardSize()&& 
        			board.getPositionValue(moves[m][0], moves[m][1]) < 0) {
        		
        			
	        		board.setPositionValue(moves[m][0], moves[m][1], num);
	        		
	        		
		        	if(solveKnightsTour(board,moves[m][0],moves[m][1],num+1))
		        		return true;
		        	board.setPositionValue(moves[m][0], moves[m][1], -1);
	        }
        }
        
        return false;
    }
}    
