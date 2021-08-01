import java.lang.Thread;

public class Cricket extends Thread{
	// [ATRIBUTOS]
	public int id = 0;
	private int goal;
	
	public int jumpNumber; //Total de Pulos que o Grilo deu
	public int jumpDist; //Distância que pulou no pulo atual
	public int totalDist; //Distância total percorrida
	public boolean checkGoal = false;
	
	public Cricket (int id, int goal) {
		this.id = id;
		this.goal = goal;
	}
	
	public int randomJump() {return (int)(1 + Math.random() * 20);}
	
	@Override
	public void run() {
		System.out.println("Cricket " + this.id + ": I'm Ready! \n");
	}
	
	public void doJump() {
		this.jumpNumber++;
		this.jumpDist = randomJump();
		this.totalDist += this.jumpDist;
		System.out.println("Cricket " + this.id + " jumped " + this.jumpDist + "cm. \n"
				+ "Cricket " + this.id + " total distance: " + this.totalDist+ "cm.\n"
				+ "Cricket " + this.id + " jumped " + this.jumpNumber + " times. \n");
	}

}
