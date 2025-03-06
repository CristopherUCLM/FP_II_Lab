package Tipos_Pokeballs;

import HITO_II.Pokeball;
import HITO_II.Pokemon;

public class Masterball extends Pokeball{
	
	protected double estabilidad;
	
	public Masterball(double e){
		this.estabilidad = e;
	}
	
	
	/*Overide*/
	public boolean intentarCaptura(Pokemon p) {		
		
		return true;
	}

}
