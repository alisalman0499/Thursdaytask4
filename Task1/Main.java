//1a
public class Main{
	public static void main(String[] args){
		/*
		//1g
		Team team = new Team("Team 1");
		//1i
		team.setRank(3);
		System.out.println(team.toString());
		*/

		Team[] teams = new Team[6];
		for (int i = 0; i < teams.length; i++){
			teams[i] = new Team("Team " + (i + 1));
		}

		teams[0].setRank(3);
		teams[1].setRank(6);
		teams[2].setRank(5);
		teams[3].setRank(2);
		teams[4].setRank(4);
		teams[5].setRank(1);

		for (Team team : teams){
			System.out.println(team);
		}

		for (Team team : teams){
			team.addPlayerName("Hugo");
			team.addPlayerName("Louis");
			team.addPlayerName("Juan");
			team.addPlayerName("Gonzales");
		}

		for (Team team : teams){
			System.out.println(team);
		}





	}
}