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
		
		play.uC1Case();
		play.uC2();
		
		while(turn!=0) {
			System.out.print("want to play with pc 0 for pc with second player 1  - ");
			Scanner scanInput = new Scanner(System.in);
		 getUserInput = scanInput.nextInt();
			
			if(getUserInput==0) {
				//computer move random
				play.uC6();
				//play.uC1Case();
				turn=0;
			}else if(getUserInput==1) {
				System.out.println("play with second player");
				turn=0;
			}
		}
		

		while (win != 0) {
			result = play.uC7();
			if (result == 2) {
				win = 0;
				int repeat = play.uC13();
				if (repeat == 1) {
					result = 0;
					win = 1;
					play.uC1Case();

				} else {
					break;
				}

			} else {
				play.uC1Case();
				play.uC5();
				play.uC3();
				if(getUserInput==0) {
					//computer play
					play.uC8();
				}else {
					System.out.println("play second player");
					play.uC1Case();
					play.secondPlayer();
				}
				
				play.uC1Case();

			}

		}

	}
}
