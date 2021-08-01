
public class AppCricket {
	public static int CRICKETNUMBER = 100;
	public static int GOAL = 200;
	
	public static void main(String[] args) {
	System.out.println("Welcome to the CricketRace! \n Do your bets! \n We have a total of " + CRICKETNUMBER + " crickets running this time! \n");
	
	int add = 0;
	Cricket winner;
	boolean endRun = false;
	
	int[] winnersPodium = new int[CRICKETNUMBER + 1];
	int goalPodium = 1;
	
	Cricket[] crickets = new Cricket[CRICKETNUMBER];
	
	for (int i = 0; i < crickets.length; i++) {
		crickets[i] = new Cricket(add);
		add++;
		System.out.println("Cricket " + crickets[i].id + ": I'm Ready! \n");
	}
	
	//EVERYBODY JUMP!
	while(true) {
	for (int i = 0; i < crickets.length; i++) {
		if (crickets[i].checkGoal == false) {
			crickets[i].doJump();
			
			if(crickets[i].totalDist >= GOAL) 
			{
				crickets[i].checkGoal = true;
				System.out.print("\n == Cricket " + i + " crossed the finish line in " + goalPodium + "st Place with a total of " + crickets[i].jumpNumber + " jumps! == \n \n");
				winnersPodium[goalPodium] = crickets[i].id;
				goalPodium++;
				
				if (goalPodium >= CRICKETNUMBER + 1) endRun = true;
			}
		}

	}
	
	if(endRun) {
		for (int i = 1; i < winnersPodium.length; i++) {
			System.out.print(i + "st Place: Cricket " + winnersPodium[i] + " [TOTAL JUMPS:" + crickets[winnersPodium[i]].jumpNumber + " / DISTANCE: " + crickets[winnersPodium[i]].totalDist +"cm]\n");
		}
		break;
		}
	}
	
	}
}
