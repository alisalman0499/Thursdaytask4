import java.util.ArrayList;
//1b
public class Team{
	//1c
	private String name;
	//1d
	private int rank;
	//1e
	private ArrayList<String> players = new ArrayList<String>();

	//1f
	public Team(String name){
		this.name = name;
	}

	//1h
	public void setRank(int rank){
		this.rank = rank;
	}

	//1j
	public String toString(){
		String teamInfo = "Hold: " + name + " Rang: " + rank + "\n";
		if (players != null){
			for (int i = 0; i < players.size(); i++){
				teamInfo = teamInfo + "Player " + (i + 1) + ": " + players.get(i) + "\n";
			}
		}
		return teamInfo;
	}

	//1l
	public void addPlayerName(String playerName){
		players.add(playerName);
	}
}