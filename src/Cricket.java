
public class Cricket {
	private int id;
	
	public int jumpNumber; //Total de Pulos que o Grilo deu
	public int thisJumpDist; //Dist�ncia que pulou no pulo atual
	public int jumoTotalDist; //Dist�ncia total percorrida
	
	public void doJump() {
		
	}
	
	public int randomJump() {
		return (int)(1 + Math.random() * 20);
	}

}
