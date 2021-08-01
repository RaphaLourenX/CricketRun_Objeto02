import java.util.ArrayList;
import java.io.*;

public class AppCricket {
	public static int CRICKETNUMBER;
	public static int GOAL;
	
	public static void main(String[] args) {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	System.out.println("Welcome to the CricketRace! \n Do your bets! \n We have a total of " + CRICKETNUMBER + " crickets running this time! \n");
	
	System.out.println("Write the number of crickets to race:\n");
	
	try {
		CRICKETNUMBER = Integer.parseInt(br.readLine());
	} catch (NumberFormatException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
    System.out.println("Write the length of the race track:\n");
	
	try {
		GOAL = Integer.parseInt(br.readLine());
	} catch (NumberFormatException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	int add = 0;
	Cricket winner;
	boolean endRun = false;
	
	int[] winnersPodium = new int[CRICKETNUMBER + 1];
	int goalPodium = 1;
	
	Cricket[] crickets = new Cricket[CRICKETNUMBER];
	
	//NEW IMPLEMENTATION
	ArrayList<Cricket> podium = new ArrayList<>();
	
	for (int i = 0; i < crickets.length; i++) {
		crickets[i] = new Cricket(i, GOAL, podium);
		crickets[i].start();
	}
	
	for (int i = 0; i < crickets.length; i++) {
		try {
			crickets[i].join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	for(int i = 0; i < podium.size(); i++) 
	{
		System.out.print((i + 1) + "st Place: Cricket " + podium.get(i).id + " [TOTAL JUMPS:" + crickets[i].jumpNumber + " / DISTANCE: " + crickets[i].totalDist +"cm]\n");
	}
	
	
	//EVERYBODY JUMP!
	/*while(true) {
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
	}*/
	
	}
}
