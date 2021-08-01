
public class AppCricket {
	public static int CRICKETNUMBER = 1000;
	public static int GOAL = 200;
	
	public static void main(String[] args) {
	System.out.println("Welcome to the CricketRace! \n Do your bets! \n We have a total of " + CRICKETNUMBER + " crickets running this time! \n");
	
	int add = 0;
	Cricket winner;
	boolean hasWinner = false;
	
	Cricket[] crickets = new Cricket[CRICKETNUMBER];
	
	for (int i = 0; i < crickets.length; i++) {
		crickets[i] = new Cricket();
		crickets[i].id = add;
		add++;
		System.out.println("Cricket " + crickets[i].id + ": I'm Ready! \n");
	}
	
	//EVERYBODY JUMP!
	while(true) {
	for (int i = 0; i < crickets.length; i++) {
		crickets[i].doJump();
		if(crickets[i].totalDist > GOAL) 
		{
			winner = crickets[i];
		    System.out.println("The winner is Cricket" + crickets[i].id + ".");
		    hasWinner = true;
		}
	}
	if(hasWinner) break;
	}
	
	}
}
