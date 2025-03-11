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
		pokeballs[3] = new Masterball(0.8); // MasterBall
		pokeballs[4] = new Pokeball(4); // Pokéball clásica
		pokeballs[5] = new Superball(10, 0); // SuperBall
		
		Pokemon equipoPokemon [] = new Pokemon[6];
		
		for(int i = 0; i<equipoPokemon.length; i++) {equipoPokemon[i] = new Pokemon("Vacio", "", 0, 0,0);}

		// Crear al entrenador Ash
		Entrenador ash = new Entrenador("Ash", pokeballs, equipoPokemon);

		// Crear Pokémones
		Pokemon[] pokemons = {
				new Pokemon("Pikachu", "Eléctrico", 1, 30, 100),
				new Pokemon("Bulbasaur", "Planta", 1, 35, 100),
				new Pokemon("Charmander", "Fuego", 1, 40, 100),
				new Pokemon("Squirtle", "Agua", 1, 25, 100),
				new Pokemon("Jigglypuff", "Normal", 1, 20, 100),
				new Pokemon("Geodude", "Roca", 1, 50, 100),
				new Pokemon("Machop", "Lucha", 1, 45, 100),
				new Pokemon("Abra", "Psíquico", 1, 15, 100),
				new Pokemon("Onix", "Roca", 1, 60, 100)
		};

		// Mostrar información de los Pokémon creados
		for (Pokemon p : pokemons) {
			System.out.printf("Pokemon: %s Tipo: %s Nivel: %d Velocidad: %d Experiencia: %d Salud: %d\n",
					p.getNombre(), p.getTipo(), p.getNivel(), p.getVelocidad(), 1, p.getSalud());
		}

		// Intentos de captura
		for (Pokemon p : pokemons) {
			ash.captura(p);
		}

		// Mostrar estado de los Pokémon capturados
		ash.imprimirEquipo();
	}
}
