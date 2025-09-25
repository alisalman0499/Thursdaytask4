//1b
public class Team{
	//1c
	private String name;
	//1d
	private int rank;
	//1e
	private String[] players;

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
		return "Hold: " + name + " Rang: " + rank;
	}
}