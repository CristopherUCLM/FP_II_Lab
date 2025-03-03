package HITO_I;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo al entrenador
		
		//Creo las pokeballs con integridad a 10
		Pokeball [] pokeballs = new Pokeball[6];
		for(int i = 0; i<pokeballs.length;i++) {
			pokeballs[i] = new Pokeball(10); //En este habría usado "set Energía" pero hay que inicializar cada objeto
		}
		//Inicializo el array del equipo
		Pokemon [] equipoPokemon = new Pokemon[3];
		for(int i = 0; i<equipoPokemon.length;i++) {
			equipoPokemon[i] = new Pokemon("Vacio", "Nada"); //En este habría usado "set Energía" pero hay que inicializar cada objeto
		}
		
		Entrenador Ash = new Entrenador("Ash", pokeballs, equipoPokemon);
		
		//Creo los pokemones
		Pokemon Pikachu = new Pokemon("Pikachu", "Eléctrico");
		Pokemon Bulbasaur = new Pokemon("Bulbasaur", "Planta");
		Pokemon Charmander = new Pokemon("Charmander", "Fuego");
		Pokemon Squirtle = new Pokemon("Squirtle", "Agua");
		Pokemon Caterpie = new Pokemon("Caterpie", "Bicho");
		
		estadoInicial(Pikachu, Bulbasaur, Charmander);
		
		
		//Intentar capturar
		if(Ash.captura(Pikachu) == true) {
			Ash.agregarPokemon(Pikachu);
		}
		if(Ash.captura(Bulbasaur) == true) {
			Ash.agregarPokemon(Bulbasaur);
		}
		if(Ash.captura(Charmander) == true) {
			Ash.agregarPokemon(Charmander);
		}
		if(Ash.captura(Squirtle) == true) {
			Ash.agregarPokemon(Squirtle);
		}
		
		//Poner todas las pokeballs a 0 de energía
		Ash.setEnergiaPokeballs(0);
		
		//Probar a capturar a Caterpie
		if(Ash.captura(Caterpie) == true) {
			Ash.agregarPokemon(Caterpie);
		}

		//Estado final del equipo
		System.out.println("==Estado final del equipo==");
		Ash.imprimirEquipo();
		
		//Método toString
		System.out.println(Ash.toString());
	}
	
	
	public static void estadoInicial(Pokemon p1, Pokemon p2, Pokemon p3 ) { //Imprimir el estado inicial.
		System.out.println("==Estado inicial de los Pokemons==");
		System.out.printf("Pokemon : %s Tipo %s \nPokemon : %s Tipo %s \nPokemon : %s Tipo %s \n",
							p1.getNombre(), p1.getTipo(), p2.getNombre(), p2.getTipo(),p3.getNombre(), p3.getTipo());	
	}
	


}
