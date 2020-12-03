package UseCases;

import java.util.Scanner;

public class TicTocToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] board=createBoard();
		inputFromUser();
		displayBoard(board);
		Scanner sc=new Scanner(System.in);
		int pos=sc.nextInt();
		System.out.print(pos);
		userDesiredPlace(board,pos,"player");
		
		
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
	 public static void displayBoard(char[] board) {
		 for (int i = 0; i < 3; i++) {
	       System.out.println(board[i]+"|"+board[i+1]+"|"+board[i+2]+"|x");
	        }
	 }
	 //UseCase4
	 
	 public static void userDesiredPlace(char[] board,int pos,String user) {
		 char symbol=' ';
		 if(user.equals("player")) {
			 symbol='X';
		 }else if(user.equals("computer")) {
			 symbol='O';
		 }
		 switch(pos) {
		 case 1:
			 board[0]= symbol;
			 break;
		 case 2:
		 board[1]= symbol;
		 break;
		 case 3:
		 board[3]=symbol;
		 break;
		 case 4:
			 board[4]=symbol;
			 break;
		 case 5:
			 board[5]=symbol;
			 break;
		 case 6:
			 board[6]=symbol;
			 break;
		 case 7:
			 board[7]=symbol;
			 break;
		 case 8:
			 board[8]=symbol;
			 break;
		 case 9:
			 board[9]=symbol;
			 break;
			 default:
				 break;
				 
			 
		}
	 }
	 
	 
}

