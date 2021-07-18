import java.util.Scanner;

public class TicTacToeGame {
	public static void main(String[] args) {
		char[] gameBoard = new char[10];
		int check = 0;
		int result = 0;
		int win = 1;
		int turn=1;
		int getUserInput=0;
		
		for (int i = 0; i < gameBoard.length; i++) {
			gameBoard[i] = ' ';
		}
		
		UC1 play = new UC1();
		
		play.UC1Case();
		play.UC2();
		
		while(turn!=0) {
			System.out.print("want to play with pc 0 for pc with second player 1  - ");
			Scanner scanInput = new Scanner(System.in);
		 getUserInput = scanInput.nextInt();
			
			if(getUserInput==0) {
				//computer move random
				play.UC6();
				turn=0;
			}else if(getUserInput==1) {
				System.out.println("play with second player");
				turn=0;
			}
		}
		

		while (win != 0) {
			result = play.UC7();
			if (result == 2) {
				win = 0;
				int repeat = play.UC13();
				if (repeat == 1) {
					result = 0;
					win = 1;
					play.UC1Case();

				} else {
					break;
				}

			} else {
				play.UC1Case();
				play.UC5();
				play.UC3();
				if(getUserInput==0) {
					//computer play
					play.UC8();
				}else {
					System.out.println("play second player");
					play.UC1Case();
					play.secondPlayer();
				}
				
				play.UC1Case();

			}

		}

	}
}
