import java.util.Scanner;

public class UC1 extends Uc2Case  {
	//initilized variables
//	public char[] gameBoard = new char[10];
//	public char player;
//	public char pc;
//	public boolean checkInitilize = true;


	//UC1 case is for empty array design pattern
	public void uC1Case() {
		int count = 0;
		int design = 0;
		int countTwo = 0;

		if (checkInitilize == true) {
			for (int i = 0; i < gameBoard.length; i++) {
				gameBoard[i] = ' ';
			}
			checkInitilize = false;
		}

		for (int i = 0; i < gameBoard.length - 1; i++) {

			System.out.print(" " + gameBoard[i] + " ");

			if (design < 2) {
				System.out.print("|");
				design++;
			} else {
				design = 0;
			}

			count++;
			if (count == 3) {
				System.out.print("\n");
				count = 0;
				countTwo++;
				if (countTwo <= 2) {
					System.out.println("___ ___ ___");
				}
			}

		}

	}
	//UC2 case is for user choice X or O
//	public void uC2() {
//		System.out.print("Enter for player X or O - ");
//		Scanner scanInput = new Scanner(System.in);
//		char getUserInput = scanInput.next().charAt(0);
//
//		if (getUserInput == 'X' || getUserInput == 'O') {
//			if (getUserInput == 'X') {
//				this.player = 'X';
//				this.pc = 'O';
//			} else {
//				this.player = 'O';
//				this.pc = 'X';
//			}
//		} else {
//			System.out.println("wrong input");
//			uC2();
//		}
//		System.out.println("player select - " + this.player + " pc select - " + this.pc);
//
//	}
//	//UC3 case is for checking empty location
//	public void uC3() {
//		System.out.print("Enter location number between 1-9 - ");
//		Scanner scanInput = new Scanner(System.in);
//		int getUserInput = scanInput.nextInt();
//
//		if (getUserInput > 0 && getUserInput < 10) {
//
//			if (gameBoard[getUserInput - 1] == ' ') {
//				System.out.println("empty location");
//				uC4(getUserInput);
//
//			} else {
//				System.out.println("filled location");
//				uC3();
//			}
//		} else {
//			System.out.println("wrong input");
//		}
//	}
//	//UC4 case is for next move
//	public void uC4(int getUserInput) {
//			gameBoard[getUserInput - 1] = this.player;
//	}
//	//UC5 case is for checking empty location and move
//	public void uC5() {
//		
//		int sendTieValue=0;
//		System.out.println("---------------------------------");
//		System.out.println("available location");
//		for (int i = 0; i < gameBoard.length - 1; i++) {
//			if (gameBoard[i] == ' ') {
//				System.out.print(i + 1 + " ");
//			
//			}
//		}
//		System.out.println("\n---------------------------------");
//	
//	}
//	//UC6 case is for toss play first computer move
//	public void uC6() {
//		int firstMove = (int) Math.random() * 2;
//		if (firstMove == 0) {
//			System.out.println("computer move");
//			int nextMove = (int) (Math.random() * 9);
//			gameBoard[nextMove] = this.pc;
//			uC1Case();
//
//		} else {
//			System.out.println("player move");
//		}
//
//	}
//	//UC7 case is for checking win ,tie or turn change
//	public int uC7() {
//		int winnerPlayer = 0;
//		int sendVal = 0;
//		int playerOrPc=0;
//
//		System.out.println("--------------------------------------");
//		if (gameBoard[0] == this.player && gameBoard[1] == this.player && gameBoard[2] == this.player) {
//			System.out.println("player 1 win :)");
//			winnerPlayer = 1;
//			sendVal=2;
//			playerOrPc=1;
//
//		}
//		if (gameBoard[3] == this.player && gameBoard[4] == this.player && gameBoard[5] == this.player) {
//			System.out.println("player 1 win :)");
//			winnerPlayer = 1;
//			sendVal=2;
//			playerOrPc=1;
//
//		}
//		if (gameBoard[6] == this.player && gameBoard[7] == this.player && gameBoard[8] == this.player) {
//			System.out.println("player 1 win :)");
//			winnerPlayer = 1;
//			sendVal=2;
//			playerOrPc=1;
//
//		}
//		if (gameBoard[0] == this.player && gameBoard[3] == this.player && gameBoard[6] == this.player) {
//			System.out.println("player 1 win :)");
//			winnerPlayer = 1;
//			sendVal=2;
//			playerOrPc=1;
//
//		}
//		if (gameBoard[1] == this.player && gameBoard[4] == this.player && gameBoard[7] == this.player) {
//			System.out.println("player 1 win :)");
//			winnerPlayer = 1;
//			sendVal=2;
//			playerOrPc=1;
//
//		}
//		if (gameBoard[2] == this.player && gameBoard[5] == this.player && gameBoard[8] == this.player) {
//			System.out.println("player 1 win :)");
//			winnerPlayer = 1;
//			sendVal=2;
//			playerOrPc=1;
//
//		}
//		if (gameBoard[0] == this.player && gameBoard[4] == this.player && gameBoard[8] == this.player) {
//			System.out.println("player 1 win :)");
//			winnerPlayer = 1;
//			sendVal=2;
//			playerOrPc=1;
//
//		}
//		if (gameBoard[2] == this.player && gameBoard[4] == this.player && gameBoard[6] == this.player) {
//			System.out.println("player 1 win :)");
//			winnerPlayer = 1;
//			sendVal=2;
//			playerOrPc=1;
//
//		}
//		// pc moves
//		if(playerOrPc!=1)
//		{
//		if (gameBoard[0] == this.pc && gameBoard[1] == this.pc && gameBoard[2] == this.pc) {
//			System.out.println("player 2 win :)");
//			winnerPlayer = 1;
//			sendVal=2;
//		}
//		if (gameBoard[3] == this.pc && gameBoard[4] == this.pc && gameBoard[5] == this.pc) {
//			System.out.println("player 2 win :)");
//			winnerPlayer = 1;
//			sendVal=2;
//		
//		}
//		if (gameBoard[6] == this.pc && gameBoard[7] == this.pc && gameBoard[8] == this.pc) {
//			System.out.println("player 2 win :)");
//			winnerPlayer = 1;
//			sendVal=2;
//		
//		}
//		if (gameBoard[0] == this.pc && gameBoard[3] == this.pc && gameBoard[6] == this.pc) {
//			System.out.println("player 2 win :)");
//			winnerPlayer = 1;
//			sendVal=2;
//		
//		}
//		if (gameBoard[1] == this.pc && gameBoard[4] == this.pc && gameBoard[7] == this.pc) {
//			System.out.println("player 2 win :)");
//			winnerPlayer = 1;
//			sendVal=2;
//		
//		}
//		if (gameBoard[2] == this.pc && gameBoard[5] == this.pc && gameBoard[8] == this.pc) {
//			System.out.println("player 2 win :)");
//			winnerPlayer = 1;
//			sendVal=2;
//		
//		}
//		if (gameBoard[0] == this.pc && gameBoard[4] == this.pc && gameBoard[8] == this.pc) {
//			System.out.println("player 2 win :)");
//			winnerPlayer = 1;
//			sendVal=2;
//		
//		}
//		if (gameBoard[2] == this.pc && gameBoard[4] == this.pc && gameBoard[6] == this.pc) {
//			System.out.println("player 2 win :)");
//			winnerPlayer = 1;
//			sendVal=2;
//		
//
//		}
//		}
//		
//		boolean tieOrChange=false;
//		if (winnerPlayer == 0) {
//			int emptyLocation = 0;
//			for (int i = 0; i < gameBoard.length - 1; i++) {
//				if (gameBoard[i] == ' ') {
//					tieOrChange=true;
//				}
//			}
//			}
//			if (tieOrChange==true) {
//				System.out.println("Change the turn");
//				sendVal=1;
//			} else {
//				if(winnerPlayer==0) {
//					System.out.println("tie");
//				}
//				
//				sendVal=2;
//			}
//		 return sendVal;
//		
//	}
//	//UC8 case is for pc movement
//	public void uC8() {
//		int random=(int)(Math.random()*9+1);
//		if(gameBoard[random-1]==' ') {
//			gameBoard[random-1]=this.pc;
//		}else {
//			uC8();
//		}
//	}
//	//UC12 case is for continue playing till board full 
//	public int uC12() {
//		return 0;
//	}
//	//UC13 case is for again play
//	public int uC13() {
//		System.out.print("Want to repeat-1 for yes 0r 0 for No ");
//		Scanner scanInput = new Scanner(System.in);
//		int getUserInput = scanInput.nextInt();
//		
//		if(getUserInput==1) {
//			checkInitilize=true;
//		}
//		int sendValue;
//		if(getUserInput==1) {
//			sendValue=1;
//		}else {
//			sendValue=0;
//		}
//		return sendValue;
//	}

	public void secondPlayer() {
		int input =1;
		uC5();
		while(input!=0) {
			System.out.print("Enter location number between 1-9 - ");
			Scanner scanInput = new Scanner(System.in);
			int getUserInput = scanInput.nextInt();

			if (getUserInput > 0 && getUserInput < 10) {

				if (gameBoard[getUserInput - 1] == ' ') {
					System.out.println("empty location");
					gameBoard[getUserInput - 1] = this.pc;
					input=0;

				} else {
					System.out.println("filled location");
				}
			} else {
				System.out.println("wrong input");
			}
		}


	}
}
