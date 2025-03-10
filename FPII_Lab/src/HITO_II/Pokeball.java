package HITO_II;

public class Pokeball {
	protected int energia = 10;
	
	public Pokeball() {} //Constructor vacio para la masterball
	
	public Pokeball(int energia) {
		this.energia = energia;
	}
	
	public int getEnergia() {
		return this.energia;
	}
	
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	

	
	/*Métodos de lógica*/
	public boolean intentarCaptura(Pokemon pokemon) { //Probabilidad del 10%
		
		int num = (int) Math.random()*100;
		
		if(num<10) {return true;} //Intenta capturar siguiendo la probabilidad
		else {return false;}
		
	}
	
	
}
