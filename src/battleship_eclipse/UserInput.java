package battleship_eclipse;

import java.util.Scanner;

public class UserInput {
	private static Scanner in = new Scanner(System.in);
	
	public static String inputString(String message)
	{
		String userInput = " ";
			System.out.println(message);
			if(in.hasNextLine()) 
			{
				userInput = in.nextLine();
			} 
		return userInput;
	}
	
//	String playerInput = in.useDelimiter("[A-J]([1-9]|10)").nextLine();
//    for(int i = 0; i < 5; i++){
//        //System.out.println(this.fleet[i].getShipClass());
//        //System.out.println(this.fleet[i].getShipLength());
//    }
}
