package info.scce.dime.app.demo;

import java.util.*;


//import de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Assignment;
//import de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.*;
import de.ls5.dywa.generated.entity.models.app.*;

import de.ls5.dywa.generated.controller.models.app.*;

public class Game {
	//board[col][row]
	private static Long[][] board;

	public static void initialise() {
		//set all the cells to empty
		board = new Long[7][6];
		for(int i = 0; i<7; i++) {
			for(int j = 0; j<6; j++) board[i][j] = 0l;
		}
		System.out.println("BOARD INIT SUCCESSFUL 2");
		//System.out.println(display(board));
	}

	public static List<List<Long>> getBoard() {
		List result = new ArrayList();
		for (Long[] col : board) {
		    result.add(Arrays.asList(col));      
		}
		return result;
	}
	
	public static List<Long> makeCol(Long index){
		return Arrays.asList(new Long[] {0l, 0l, 0l, 0l, 0l, 0l});
	}
	
	public static Long getCell(Long col, Long row) {
		return board[col.intValue()][row.intValue()];
	}
	
	//gives a list {0, 1, 2, ..., board.length-1} for board construction
	//HARDCODED VALUE HERE
	public static List<Long> getBoardWidth() {
		List<Long> result = new ArrayList<Long>();
		for(int i = 0; i <= 7 ; i++) result.add((long) i); 
		return result;
		
	}
	

	//col is 0-6, player is 1-2
	//false if no win, true if win
	/*
	public static boolean takeTurn(Long col, Long player) {
		//set the next empty cell in this col to this player's number
		for(int i = board[0].length-1; i > 0; i--) {
			if(board[col.intValue()][i] == 0) {
				board[col.intValue()][i] = player;
				break;
			}
		}
		System.out.println(display(board));
		return checkWin(board, player);
	}
	*/
	
	public static Board placeCoin(Board board, Long player, Long index) {
		//get cells of column in question
		List<Cell> cells = board.getcolumns_Column().get(index.intValue()).getcells_Cell();
		//column is already full
		if(cells.get(0).getvalue() != 0l) {
			System.err.println("Column index "+ index + " is already full! Turn cancelled");
			return board;
		}
		for(int i = cells.size() - 1; i >= 0; i--) {
			Cell thisCell = cells.get(i);
			if(thisCell.getvalue().equals(0l)) {
				thisCell.setvalue(player);
				break;
			}
		}
		System.out.println("TURN TAKEN SUCCESSFULLY BY PLAYER " + player);
		System.out.println(display(board));
		
		
		return board;
	}
	
	
	//returns string representation of the board obj
	public static String display(Board board) {
		String output = "";
		for (int i = 0; i < board.getcolumns_Column().size(); i++) {
			for (int j = 0; j < board.getcolumns_Column().get(0).getcells_Cell().size(); j++) {
				output += board.getcolumns_Column().get(i).getcells_Cell().get(j).getvalue().intValue() + " ";
			}
			output += "\n";
		}
		return output;
	}

	public static boolean checkWin(Board _board, Long player) {
		//WIN CHECKING
		//might just build the 2d array from the board obj lol very bold
		int width = _board.getcolumns_Column().size();
		int height = _board.getcolumns_Column().get(0).getcells_Cell().size();
		
		Long[][] board = new Long[width][height];
		
		for(int i = 0; i < width; i++) {
			for(int j = 0; j < height; j++) {
				board[i][j] = _board.getcolumns_Column().get(i).getcells_Cell().get(j).getvalue();
			}
		}
		
		//vertical
		//i is row, j is col, k is cell of 4
		//bottom 3 rows arent checked as the last cell will be out of bounds
		for(int i = 0; i<board[0].length - 3; i++) {
			for(int j = 0; j < board.length; j++) {
				//if all 4 cells are = to player checking win, they win
				if(board[j][i] ==player && board[j][i+1] ==player && board[j][i+2] ==player && board[j][i+3] ==player) {
					return true;
				}
			}
		}
		//horizontal
		for(int i = 0; i<board[0].length; i++) {
			for(int j = 0; j < board.length - 3; j++) {
				if(board[j][i] ==player && board[j+1][i] ==player && board[j+2][i] ==player && board[j+3][i] ==player) {
					return true;
				}
			}
		}
		//board[col][row]
		//diagonal /
		for(int i = 0; i<board[0].length - 3; i++) {
			for(int j = 3; j < board.length - 3; j++) {
				if(board[j][i] ==player && board[j-1][i+1] ==player && board[j-2][i+2] ==player && board[j-3][i+3] ==player) {
					return true;
				}
			}
		}
		//diagonal \
		for(int i = 0; i<board[0].length - 3; i++) {
			for(int j = 0; j < board.length - 3; j++) {
				if(board[j][i] ==player && board[j+1][i+1] ==player && board[j+2][i+2] ==player && board[j+3][i+3] ==player) {
					return true;
				}
			}
		}
		//no win
		return false;

	}
	
	public static void pC(Long index) {
		System.out.println(index+"");
	}
	
	public static void addCell(Cell cell, Column column) {
		column.getcells_Cell().add(cell);
	}
	
	public static Long switchPlayer(Long player) {
		if(player == 1l) return (Long)2l;
		//(if player == 2l)
		return (Long)1l;
	}
}
