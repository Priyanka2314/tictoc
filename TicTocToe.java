package UseCases;

import java.util.Scanner;

public class TicTocToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] board=createBoard();
		inputFromUser();
		displayBoard(board);
		
	}
	
	//UseCase1
	 public static char[] createBoard() {
		 char[] board=new char[10];
		 for(int i=0;i< board.length;i++) {
			 board[i]=' ';
		 }
		 return board;
		 }
	 
	 //UseCase2
	 public static  String inputFromUser() {
		  Scanner in=new Scanner(System.in);
		  String player,computer;
		 System.out.print("Enter  your choice: ");
		  player=in.nextLine();
		  boolean isPlayer= true;
		  boolean wasPlayer=(isPlayer)?true: false;
		  if(wasPlayer)
			  player="0";
		  else
			  computer="X";
		  return player;
		  
		 }
	 //UseCase3
	 public static void displayBoard(char tictoc[]) {
	 for(int i=1;i<=9;i++) {
		 System.out.println(tictoc[i]+" ");
	 }
	 }
	 
}

