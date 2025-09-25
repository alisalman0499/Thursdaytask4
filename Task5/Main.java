import java.util.ArrayList;
//4e
public class Main{
	public static void main(String[] args){
		//4f
		ArrayList<String> actions = new ArrayList<String>();
		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");

		//4g
		GameMenu menu = new GameMenu(actions);
		//4i

		//5d
		String choice = menu.promptUser();

		
		
	} 

	//5e
	public static void doAction(int action){
		//5f
		switch (action){
			case 1:
				System.out.println("Starting the game now");
				break;
			case 2:
				System.out.println("Fetching previously saved game data");
				break;
			case 3:
				System.out.println("Game paused");
				break;
			case 4:
				System.out.println("Ending game");
				break;
			
		}
	}
}