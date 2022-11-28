package info.scce.dime.app.demo;

import java.util.*;

import de.ls5.dywa.generated.entity.models.app.*;

public class Game {
	
	//returns a list of Longs, size = height of the board
	public static List<Long> makeEmptyColumn(Long height){
		List<Long> column = new ArrayList<Long>();
		for(int i = 0; i < height.intValue(); i++) column.add((Long)0l);
		return column;
	}
	
	
	//gives a list {0, 1, 2, ..., (width of board - 1)} for board construction
	
	public static List<Long> makeIndexList(Long width){
		List<Long> result = new ArrayList<Long>();
		for(int i = 0; i < width.intValue() ; i++) result.add((long) i); 
		return result;
	}
	

	public static Board placeCoin(Board board, Long player, Long index) {
		//get cells of column in question
		List<Cell> cells = board.getcolumns_Column().get(index.intValue()).getcells_Cell();
		
		//column is already full
		if(cells.get(0).getvalue() != 0l) {
			System.err.println("Column index "+ index + " is already full! Turn cancelled, also CheckIsColumnFull SIB has failed somehow");
			return board;
		}
		for(int i = cells.size() - 1; i >= 0; i--) {
			Cell thisCell = cells.get(i);
			if(thisCell.getvalue().equals(0l)) {
				thisCell.setvalue(player);
				break;
			}
		}

		return board;
	}
	
	
	//DEBUG: Print out the board
	public static void printBoard(String location, Board board) {
		System.err.println("BOARD AT LOCATION " + location);
		System.out.println(display(board));
	}
	
	//DEBUG: String representation of board
	public static String display(Board board) {
		int width = board.getcolumns_Column().size();
		int height = board.getcolumns_Column().get(0).getcells_Cell().size();
		String output = "";
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				output += board.getcolumns_Column().get(j).getcells_Cell().get(i).getvalue().intValue() + " ";
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
		
		//board[col][cell]
		Long[][] board = new Long[width][height];
		
		for(int i = 0; i < width; i++) {
			for(int j = 0; j < height; j++) {
				board[i][j] = _board.getcolumns_Column().get(i).getcells_Cell().get(j).getvalue();
			}
		}
		
		//vertical
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j<board[0].length - 3; j++) {
				if(board[i][j] ==player && board[i][j+1] ==player && board[i][j+2] ==player && board[i][j+3] ==player) {
					return true;
				}
			}
		}
		
		//horizontal
		for (int i = 0; i < board.length - 3; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if(board[i][j] ==player && board[i+1][j] ==player && board[i+2][j] ==player && board[i+3][j] ==player) {
					return true;
				}
			}
		}
		
		//diagonal /
		for (int i = 3; i < board.length; i++) {
			for (int j = 0; j < board[0].length - 3; j++) {
				if(board[i][j] ==player && board[i-1][j+1] ==player && board[i-2][j+2] ==player && board[i-3][j+3] ==player) {
					return true;
				}
			}
		}
		
		//diagonal \
		for (int i = 0; i < board.length - 3; i++) {
			for (int j = 0; j < board[0].length - 3; j++) {
				if(board[i][j] ==player && board[i+1][j+1] ==player && board[i+2][j+2] ==player && board[i+3][j+3] ==player) {
					return true;
				}
			}
		}
		
		//no win
		return false;

	}
	
	//put cell into column, used in InitBoard
	public static void addCell(Cell cell, Column column) {
		column.getcells_Cell().add(cell);
	}
	
	//changes who's turn it is
	public static Long switchPlayer(Long player) {
		if(player == 1l) return (Long)2l;
		//(if player == 2l)
		return (Long)1l;
	}
	
	//checks whether a given column is full
	public static boolean isColumnFull (Board board, Long index) {
		//if the value stored in the first cell of the column is not 0, then the column is full
		return board.getcolumns_Column().get(index.intValue()).getcells_Cell().get(0).getvalue().intValue() != 0;
	}
}
