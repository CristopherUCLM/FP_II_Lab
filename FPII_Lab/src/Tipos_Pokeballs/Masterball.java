package Tipos_Pokeballs;

import HITO_II.Pokeball;
import HITO_II.Pokemon;

public class Masterball extends Pokeball{
	
	protected int energia = 10;
	protected double estabilidad; //del 0 al 1. 
	
	public Masterball(double e){
		this.estabilidad = e;
	}
	
	
	/*Overide*/
	public boolean intentarCaptura(Pokemon p) {		
		
		int daño = (int) ( p.getSalud() * (1 - estabilidad)); //La salud de los pokemons como el daño son enteros. Hay que castear.
		p.setSalud( p.getSalud() - daño ); //Hago el daño al pokemon
		return true;
	}

}
