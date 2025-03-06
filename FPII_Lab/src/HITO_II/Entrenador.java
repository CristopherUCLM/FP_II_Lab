package HITO_II;

public class Entrenador { //Hola cris :D
	
	private String nombre;
	private Pokeball [] invPokeballs = new Pokeball[6];
	private Pokemon [] equipoPokemon = new Pokemon[3];
	
	//Constructor
	public Entrenador(String nombre, Pokeball [] invPokeballs, Pokemon [] equipoPokemon) {
		this.nombre = nombre;
		this.invPokeballs = invPokeballs;
		this.equipoPokemon = equipoPokemon;
	}
	
	/*//getters////
	////-------------------------------------------------------------------------------------------------////
	///--------------------------------------------------------------------------------------------------//*/
	public String getNombre() {
		return this.nombre;
	}
	
	public Pokeball[] getInvPokeballs() {
		
		Pokeball auxiliar [] = new Pokeball[invPokeballs.length]; //Creo un array para clonar el equipo posición por posición
		//Copio los datos uno a uno en lugar de la dirección en memoria. 
		for(int i = 0; i<invPokeballs.length; i++) {
			auxiliar[i] = invPokeballs[i];
		}
		return auxiliar;
	}
	
	public Pokemon[] getEquipoPokemon() {
		Pokemon auxiliar [] = new Pokemon[equipoPokemon.length];
		for(int i = 0; i<equipoPokemon.length; i++) {
			auxiliar[i] = equipoPokemon[i];
		}
		return auxiliar;
	}
	
	public void imprimirEquipo() {
		
		for(int i = 0; i<equipoPokemon.length; i++) {
			System.out.printf("Pokemon : %s Tipo: %s\n", equipoPokemon[i].getNombre(), equipoPokemon[i].getTipo() );
		}
		
	}
	/*--------------------------------------------------------------------------------------------------///
	///--------------------------------------------------------------------------------------------------///
	///--------------------------------------------------------------------------------------------------*/
	
	
	//SETTERS//	
	/*-------------------------------------------------------------------------------------------------////
	///--------------------------------------------------------------------------------------------------///
	///--------------------------------------------------------------------------------------------------*/
	public void setNombre(String n) {
		this.nombre = n;
	}
	
	public void setInvPokeball(Pokeball[] p) { //Relleno mi vector con uno recibido
		for(int i = 0; i<invPokeballs.length; i++) {
			this.invPokeballs[i] = p[i];
		}
	}
	
	public void setEquipoPokemon(Pokemon[] p) {
		for(int i = 0; i<equipoPokemon.length; i++) {
			this.equipoPokemon[i] = p[i];
		}
	}
	
	public void setEnergiaPokeballs(int e) { //Le doy la misma integridad a todas las pokeballs
		for(int i = 0; i < invPokeballs.length; i++) {
			invPokeballs[i].setEnergia(e);
		}
	}
	/*--------------------------------------------------------------------------------------------------///
	//--------------------------------------------------------------------------------------------------///
	//--------------------------------------------------------------------------------------------------/*/
	
	
	
	/*Métodos de ayuda/////
	//--------------------------------------------------------------------------------------------------//
	//--------------------------------------------------------------------------------------------------//*/
	
	//Capturar el pokemon
	
	/*@MODIFICARLO!*/
	public boolean captura(Pokemon pokemon) {
		
		int imp = encontrarMejorPokeball(invPokeballs); //imp -> indice mejor pokeball
		
		//Comprueba si hay pokeballs disponibles
		if(invPokeballs[imp].getEnergia() <= 0) {
			System.out.printf("No hay pokeballs disponibles para capturar a %s.\n", pokemon.getNombre());
			return false;
		}
		
		//Comprobar que solo capture en el tercer intento
		for(int i = 0; i<3; i++) {
			imp = encontrarMejorPokeball(invPokeballs); //imp -> indice mejor pokeball
			
			if(invPokeballs[imp].getEnergia() <= 0) { //Comprueba que haya pokeballs disponibles
				System.out.println("Ninguna pokeball tiene más de 0 de integridad");
				return false;
			}
			
			if(i < 2) { // Si no estoy en la tercera captura, falla
				invPokeballs[imp].setEnergia(invPokeballs[imp].getEnergia() - 4);
				System.out.printf("La captura de %s falló!\n", pokemon.getNombre());
			}
			else{
				if(equipoLleno(equipoPokemon)) {
					System.out.printf("La captura de %s falló! No queda espacio en el equipo.\n", pokemon.getNombre());
					return false;
				}
				else {
					System.out.printf("La captura de %s fue exitosa campeón, mastodonte, ídolo, genio\n", pokemon.getNombre());
					invPokeballs[imp].setEnergia(invPokeballs[imp].getEnergia() - 4);
					return true;
				}
			}
		}
		System.out.println("¿¿¿???¿?¿?¿?");
		return false;
		
	}
	
	
	
	//Agrega el pokemon en el primer espacio vacío del equipo
	public void agregarPokemon(Pokemon pokemon) {
		for(int i = 0; i<equipoPokemon.length; i++) {
			if(equipoPokemon[i].getNombre() == "Vacio") {
				equipoPokemon[i] = pokemon;
				break;
			}
		}
	}
	
	
	//Método para buscar la pokeball con la mayor integridad
	private static int encontrarMejorPokeball(Pokeball [] invPokeballs) {
		int mejorIndice = 0;
		for(int i = 0; i< invPokeballs.length; i++) {
			
			if(invPokeballs[i].getEnergia() > invPokeballs[mejorIndice].getEnergia()) {
				mejorIndice = i;
			}
		}
		return mejorIndice;
	}
	
	
	
	//Comprobar si el equipo está lleno y, por ende, puede capturar
	public boolean equipoLleno(Pokemon [] equipoPokemon) {
		
		for(int i = 0; i<equipoPokemon.length; i++) {
			String nombre = equipoPokemon[i].getNombre();
			if (nombre == "Vacio") {
				return false;
			}
		}
		return true;
	}
	
	
	
	
	/* Método toString///
	///--------------------------------------------------------------------------------------------------//*/
	public String toString() {
		String imprimir = "Entrenador {\nnombre: '" + nombre + "' \n" + 
										"invPokeballs: " + inventarioToString() +
										"\nEquipo pokemon: " + equipoToString() + "\n           }"
				;
		return imprimir;
	}
	
	//Apoyo para el "toString"
	private String inventarioToString() {
		String inventario = "[";
		
		for(int i = 0; i<invPokeballs.length;i++) {
			inventario = inventario + Integer.toString(invPokeballs[i].getEnergia()) + " ,";
		}
		inventario = inventario + "]";
		
		return inventario;
	}
	
	private String equipoToString() {
		String equipo = "";
		
		for(int i = 0; i<equipoPokemon.length; i++){
			equipo = equipo + equipoPokemon[i].getNombre() + " ,";
		}
		
		return equipo;
	}
	/*--------------------------------------------------------------------------------------------------//*/
	
	
}


