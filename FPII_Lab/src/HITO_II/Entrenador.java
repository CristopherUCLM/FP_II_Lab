package HITO_II;

public class Entrenador { //Hola cris :D
	
	private String nombre;
	private Pokeball [] invPokeballs = new Pokeball[6];
	private Pokemon [] equipoPokemon = new Pokemon[6];
	
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

	public void captura(Pokemon p) {
		
		//Comprueba si hay espacio en el equipo
		if(!equipoLleno() && ( pokeballDisponible(invPokeballs) != -1) ) {
			
			Pokeball pokeball = invPokeballs[pokeballDisponible(invPokeballs)]; //Creo una variable para almacenar el índice de la mejor pokeball
			
			if(pokeball.intentarCaptura(p)) { //Si la captura tiene éxito
				agregarPokemon(p); //Agrega el pókemon al equipo
			}//Si no tiene éxito, sale el mensaje de depuración en la clase Pokeball
			
		}
		
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
	
	
	public static int pokeballDisponible(Pokeball [] inv) { //Busca la primera pokeball disponible
		
		int indice = 0;
		for(int i = 0; i < inv.length; i++) {
			
			if( inv[i].getEnergia() > 0) {i = indice; break;}
			else if(i == inv.length - 1) {System.out.println("No hay pokeballs disponibles"); indice = -1; }	//Comprueba que no esté dando por buena la última pokeball con energía menor a 0
		
		}
		
		return indice; //Devuelve el índice de la primera pokeball disponible
	}
	
	
	
	//Comprobar si el equipo está lleno y, por ende, puede capturar
	public boolean equipoLleno() {
		
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


