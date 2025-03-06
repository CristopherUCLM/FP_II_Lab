package HITO_II;

public class Pokeball {
	protected int energia;
	
	public Pokeball() {} //Constructor vacio para la masterball
	
	public Pokeball(int e) {
		this.energia = e;
	}
	
	public int getEnergia() {
		return this.energia;
	}
	
	public void setEnergia(int e) {
		this.energia = e;
	}
	

	
	/*Métodos de lógica*/
	public boolean intentarCaptura(Pokemon p) { //Probabilidad del 10%
		
		int num = (int) Math.random()*100;
		
		if(num<10) {return true;} //Intenta capturar siguiendo la probabilidad
		else {return false;}
		
	}
	
	
}
