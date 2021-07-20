import java.util.Scanner;

public class Uc13Case {
	public static char[] gameBoard = new char[10];
	public char player;
	public char pc;
	public boolean checkInitilize = true;
	public int uC13() {
		System.out.print("Want to repeat-1 for yes 0r 0 for No ");
		Scanner scanInput = new Scanner(System.in);
		int getUserInput = scanInput.nextInt();
		
		if(getUserInput==1) {
			checkInitilize=true;
		}
		int sendValue;
		if(getUserInput==1) {
			sendValue=1;
		}else {
			sendValue=0;
		}
		return sendValue;
	}

}
