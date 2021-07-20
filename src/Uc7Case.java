
public class Uc7Case extends Uc8Case {
	public int uC7() {
		int winnerPlayer = 0;
		int sendVal = 0;
		int playerOrPc=0;

		System.out.println("--------------------------------------");
		if (gameBoard[0] == this.player && gameBoard[1] == this.player && gameBoard[2] == this.player) {
			System.out.println("player 1 win :)");
			winnerPlayer = 1;
			sendVal=2;
			playerOrPc=1;

		}
		if (gameBoard[3] == this.player && gameBoard[4] == this.player && gameBoard[5] == this.player) {
			System.out.println("player 1 win :)");
			winnerPlayer = 1;
			sendVal=2;
			playerOrPc=1;

		}
		if (gameBoard[6] == this.player && gameBoard[7] == this.player && gameBoard[8] == this.player) {
			System.out.println("player 1 win :)");
			winnerPlayer = 1;
			sendVal=2;
			playerOrPc=1;

		}
		if (gameBoard[0] == this.player && gameBoard[3] == this.player && gameBoard[6] == this.player) {
			System.out.println("player 1 win :)");
			winnerPlayer = 1;
			sendVal=2;
			playerOrPc=1;

		}
		if (gameBoard[1] == this.player && gameBoard[4] == this.player && gameBoard[7] == this.player) {
			System.out.println("player 1 win :)");
			winnerPlayer = 1;
			sendVal=2;
			playerOrPc=1;

		}
		if (gameBoard[2] == this.player && gameBoard[5] == this.player && gameBoard[8] == this.player) {
			System.out.println("player 1 win :)");
			winnerPlayer = 1;
			sendVal=2;
			playerOrPc=1;

		}
		if (gameBoard[0] == this.player && gameBoard[4] == this.player && gameBoard[8] == this.player) {
			System.out.println("player 1 win :)");
			winnerPlayer = 1;
			sendVal=2;
			playerOrPc=1;

		}
		if (gameBoard[2] == this.player && gameBoard[4] == this.player && gameBoard[6] == this.player) {
			System.out.println("player 1 win :)");
			winnerPlayer = 1;
			sendVal=2;
			playerOrPc=1;

		}
		// pc moves
		if(playerOrPc!=1)
		{
		if (gameBoard[0] == this.pc && gameBoard[1] == this.pc && gameBoard[2] == this.pc) {
			System.out.println("player 2 win :)");
			winnerPlayer = 1;
			sendVal=2;
		}
		if (gameBoard[3] == this.pc && gameBoard[4] == this.pc && gameBoard[5] == this.pc) {
			System.out.println("player 2 win :)");
			winnerPlayer = 1;
			sendVal=2;
		
		}
		if (gameBoard[6] == this.pc && gameBoard[7] == this.pc && gameBoard[8] == this.pc) {
			System.out.println("player 2 win :)");
			winnerPlayer = 1;
			sendVal=2;
		
		}
		if (gameBoard[0] == this.pc && gameBoard[3] == this.pc && gameBoard[6] == this.pc) {
			System.out.println("player 2 win :)");
			winnerPlayer = 1;
			sendVal=2;
		
		}
		if (gameBoard[1] == this.pc && gameBoard[4] == this.pc && gameBoard[7] == this.pc) {
			System.out.println("player 2 win :)");
			winnerPlayer = 1;
			sendVal=2;
		
		}
		if (gameBoard[2] == this.pc && gameBoard[5] == this.pc && gameBoard[8] == this.pc) {
			System.out.println("player 2 win :)");
			winnerPlayer = 1;
			sendVal=2;
		
		}
		if (gameBoard[0] == this.pc && gameBoard[4] == this.pc && gameBoard[8] == this.pc) {
			System.out.println("player 2 win :)");
			winnerPlayer = 1;
			sendVal=2;
		
		}
		if (gameBoard[2] == this.pc && gameBoard[4] == this.pc && gameBoard[6] == this.pc) {
			System.out.println("player 2 win :)");
			winnerPlayer = 1;
			sendVal=2;
		

		}
		}
		
		boolean tieOrChange=false;
		if (winnerPlayer == 0) {
			int emptyLocation = 0;
			for (int i = 0; i < gameBoard.length - 1; i++) {
				if (gameBoard[i] == ' ') {
					tieOrChange=true;
				}
			}
			}
			if (tieOrChange==true) {
				System.out.println("Change the turn");
				sendVal=1;
			} else {
				if(winnerPlayer==0) {
					System.out.println("tie");
				}
				
				sendVal=2;
			}
		 return sendVal;
		
	}

}
