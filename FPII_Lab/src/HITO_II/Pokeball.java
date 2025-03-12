package HITO_II;

public class Pokeball {
	protected int energia;
	

	
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
		System.out.printf("Usando la POKEBALL para intentar la captura de %s. probabilidad de captura : 10%% || Integridad : %d\n",pokemon.getNombre(), this.energia);
		if(num<10) {
			System.out.printf("Felicidades! La captura de %s tuvo éxito!\n", pokemon.getNombre());
			this.energia= 0; //Pongo a 0 la energía para que no pueda capturar más
			return true;
		} //Intenta capturar siguiendo la probabilidad
		else {
			System.out.printf("Vaya! La captura de %s falló.\n", pokemon.getNombre());
			return false;
		}
		
	}
	
	
}
