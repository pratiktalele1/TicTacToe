
public class Uc5Case extends Uc6Case {
public void uC5() {
		
		int sendTieValue=0;
		System.out.println("---------------------------------");
		System.out.println("available location");
		for (int i = 0; i < gameBoard.length - 1; i++) {
			if (gameBoard[i] == ' ') {
				System.out.print(i + 1 + " ");
			
			}
		}
		System.out.println("\n---------------------------------");
	
	}
}
