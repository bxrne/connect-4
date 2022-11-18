package info.scce.dime.app.onbroke;

class Game {
	//board[col][row]
	private int[][] board;

	public void initialise() {
		//set all the cells to empty
		board = new int[7][6];
		for(int i = 0; i<7; i++) {
			for(int j = 0; j<6; j++) board[i][j] = 0;
		}
		System.err.println("Board init successful");
	}

	public int[][] getBoard() {
		return board;
	}

	//col is 0-6, player is 1-2
	//false if no win, true if win
	public boolean takeTurn(int col, int player) {
		//set the next empty cell in this col to this player's number
		for(int i = board[0].length-1; i > 0; i--) {
			if(board[col][i] == 0) {
				board[col][i] = player;
				break;
			}
		}
		System.out.println(display(this.board));
		return checkWin(this.board, player);
	}

	public String display(int[][] board) {
		String output = "";
		for (int i = 0; i < board[0].length; i++) {
			for (int j = 0; j < board.length; j++) {
				output += board[j][i] + " ";
			}
			output += "\n";
		}
		return output;
	}

	public boolean checkWin(int[][] board, int player) {
		//WIN CHECKING
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

}
