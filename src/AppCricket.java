
public class AppCricket {
	public static int CRICKETNUMBER = 10;
	public static int GOAL = 200;
	
	public static void main(String[] args) {
	System.out.println("Welcome to the CricketRace! \n Do your bets! \n We have a total of " + CRICKETNUMBER + " crickets running this time! \n");
	
	int add = 0;
	int winner;
	
	Cricket[] crickets = new Cricket[CRICKETNUMBER];
	
	for (int i = 0; i < crickets.length; i++) {
		crickets[i] = new Cricket();
		crickets[i].id = add;
		add++;
		System.out.println("Cricket " + crickets[i].id + ": I'm Ready! \n");
	}
	
	//EVERYBODY JUMP!
	for (int i = 0; i < crickets.length; i++) {
		crickets[i].doJump();
	}
	
	}
}
