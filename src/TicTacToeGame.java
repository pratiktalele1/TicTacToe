import java.util.Scanner;




public class TicTacToeGame {
	public static void main(String[] args) {
		char[] gameBoard = new char[10];
		int check = 0;
		int result=0;
		int win=1;
		for (int i = 0; i < gameBoard.length; i++) {
			gameBoard[i] = ' ';
		}

		UC1 play = new UC1();
		play.UC1Case();
		play.UC2();
		play.UC6();
			
		
		while (win != 0) {
			result=play.UC7();
			if(result==2&&(play.UC12()==0)) {
				win=0;
				int repeat=play.UC13();
				if(repeat==1) {
					result=0;
					win=1;
					play.UC1Case();

				}else {
					break;
				}
				
			}else {
				play.UC5();
				play.UC3();
				play.UC8();
				play.UC1Case();
			}
			
			
			
		}

	}
}
