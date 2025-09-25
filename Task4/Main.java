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

		for (String action : actions){
			System.out.println(action);
		}
	} 
}