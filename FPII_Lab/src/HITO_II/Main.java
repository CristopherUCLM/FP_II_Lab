package HITO_II;
import HITO_II.Tipos_Pokeballs.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo al entrenador
		//Marcos encargate de esto
		//Creo las pokeballs con integridad a 10
		Pokeball[] pokeballs = new Pokeball[6];
		pokeballs[0] = new Pokeball(4); // Pokéball clásica
		pokeballs[1] = new Superball(12, 0); // SuperBall
		pokeballs[2] = new Ultraball(12, 0.0); // UltraBall
		pokeballs[3] = new Masterball(10, 0.8); // MasterBall
		pokeballs[4] = new Pokeball(4); // Pokéball clásica
		pokeballs[5] = new Superball(10, 0); // SuperBall
		
		Pokemon equipoPokemon [] = new Pokemon[6];
		
		for(int i = 0; i<equipoPokemon.length; i++) { equipoPokemon[i] = new Pokemon("Vacio", "", 0, 0,0, 0); }//Creo el equipo

		// Crear al entrenador Ash
		Entrenador ash = new Entrenador("Ash", pokeballs, equipoPokemon, 5);

		// Crear Pokémones
		Pokemon[] pokemons = {
				new Pokemon("Pikachu", "Eléctrico", 1, 30, 100,0),
				new Pokemon("Bulbasaur", "Planta", 1, 35, 100,0 ),
				new Pokemon("Charmander", "Fuego", 1, 40, 100, 0),
				new Pokemon("Squirtle", "Agua", 1, 25, 100, 0),
				new Pokemon("Jigglypuff", "Normal", 1, 20, 100, 0),
				new Pokemon("Geodude", "Roca", 1, 50, 100, 0),
				new Pokemon("Machop", "Lucha", 1, 45, 100, 0),
				new Pokemon("Abra", "Psíquico", 1, 15, 100, 0),
				new Pokemon("Onix", "Roca", 1, 60, 100, 0)
		};

		// Mostrar información de los Pokémon creados
		System.out.println("========Inicio en Pokemon del Main======================================================================================================");
		for (Pokemon p : pokemons) {
			System.out.printf("Pokemon: %s Tipo: %s Nivel: %d Velocidad: %d Experiencia: %d Salud: %d\n",
					p.getNombre(), p.getTipo(), p.getNivel(), p.getVelocidad(), 1, p.getSalud());
		}

		// Intentos de captura
		System.out.println("=======HORA DE CAPTURAR!!!!! HAY QUE ATRAPARLOS A TODOSSSSSSS===========================================================================");
		for (Pokemon p : pokemons) { //Un for-each para que quede más limpio
			ash.captura(p);
		}

		// Mostrar estado de los Pokémon capturados
		System.out.println("=======Ejército de animalitos en las filas==============================================================================================");
		ash.imprimirEquipo();
	}
}
