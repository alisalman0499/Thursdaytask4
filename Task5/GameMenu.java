import java.util.ArrayList;
import java.util.Scanner;
//4a
public class GameMenu{
	//4b
	private ArrayList<String> actions = new ArrayList<String>();

	//4c
	public GameMenu(ArrayList<String> actions){
		//4d
		this.actions = actions;
	}

	//4h
	public void displayMenu(){
		for (String action : actions){
			System.out.println(action);
		}
	}

	//5a
	public String promptUser(){
		System.out.println("Type a number to choose an action: ");
		displayMenu();
		//5b
		Scanner in = new Scanner(System.in);
		String choice = in.nextLine();
		//5c
		return choice;
	}
}