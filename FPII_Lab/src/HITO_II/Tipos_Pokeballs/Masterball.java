package HITO_II.Tipos_Pokeballs;

import HITO_II.Pokeball;
import HITO_II.Pokemon;

public class Masterball extends Pokeball{

	protected double estabilidad; //del 0 al 1. 
	
	public Masterball(int energia, double establidad) {

		super(energia);
		this.estabilidad = establidad;
	}
	
	public double getEstabilidad() {
		return this.estabilidad;
	}
	
	
	/*Overide*/
	public boolean intentarCaptura(Pokemon p) {		
		
		System.out.printf("Usando la MASTERBALL para intentar la captura de %s. Probabilidad de captura : 100%% || Estabilidad : %.2f\n",p.getNombre(), this.getEstabilidad());
		int daño = (int) ( p.getSalud() * (1 - estabilidad)); //La salud de los pokemons como el daño son enteros. Hay que castear.
		p.setSalud( p.getSalud() - daño ); //Hago el daño al pokemon
		
		this.estabilidad = 0;
		this.energia = 0;
		System.out.printf("Felicidades! La captura de %s tuvo éxito!\n", p.getNombre());
		return true;
	}

}
