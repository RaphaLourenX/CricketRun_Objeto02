
public class Cricket {
	// [ATRIBUTOS]
	public int id = 0;
	
	public int jumpNumber; //Total de Pulos que o Grilo deu
	public int jumpDist; //Dist�ncia que pulou no pulo atual
	public int totalDist; //Dist�ncia total percorrida
	
	public int randomJump() {return (int)(1 + Math.random() * 20);}
	
	
	public void doJump() {
		this.jumpNumber++;
		this.jumpDist = randomJump();
		this.totalDist += this.jumpDist;
		System.out.println("Cricket " + this.id + " jumped " + this.jumpDist + "cm. \n"
				+ "Cricket " + this.id + " total distance: " + this.totalDist+ "cm.\n"
				+ "Cricket " + this.id + " jumped " + this.jumpNumber + " times. \n");
		
	}

}
