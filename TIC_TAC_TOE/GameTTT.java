package TIC_TAC_TOE;
import java.util.*;
public class GameTTT {
public static void main(String[] args) {
	char[][]board =new char[3][3];
	for (int row = 0; row < board.length; row++) {
		for (int col = 0;col<board[row].length; col++) {
			board[row][col]=' ';
		}
	}
	
	char player='X';
	boolean gameover=false;
	Scanner sc = new Scanner(System.in);
	
	while(!gameover) {
		printBoard(board);
		System.out.println();
		System.out.println("Player  "+ player+" Enter:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		if(board[row][col]==' ') {
			board[row][col]=player;
			gameover= haveWon(board,player);
			if(gameover) {
				System.out.println();
				System.out.println("******************************************");
				System.out.println("Player "+player+" has Won!!!!!!!!!!!!!!");
				System.out.println("******************************************");
			
			}
			else {
			player =(player =='X')?'O':'X';
			}
	
		}else {
			System.out.println("Invalid!Already placed");
		}
	}
	
	printBoard(board);
}

public static boolean haveWon(char[][] board,char player) {

	//column row
	for(int row=0;row<board.length;row++) {
		if(board[row][0]==player && board[row][1]==player &&board[row][2]== player) {
			return true;
		}
		//column Check
		for(int col=0;col<board[0].length;col++) {
			if(board[0][col]==player && board[1][col]==player &&board[2][col]== player){
			return true;
			}
		}
			//diagonal
		if(board[0][0]==player && board[1][1]==player && board[2][2]==player) {
			return true;
		}
		if(board[2][0]==player && board[1][1]==player && board[0][2]==player) {
			return true;
		}
		}
			
		
	return false;
}

public static void printBoard(char[][] board) {
	for (int row = 0; row < board.length; row++) {
		for (int col = 0;col<board[row].length; col++) {
		System.out.print(board[row][col]+"|");
		}

		System.out.println();
	}
}

}
