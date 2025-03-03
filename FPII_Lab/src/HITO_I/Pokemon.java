package HITO_I;

public class Pokemon {
	
	private String nombre;
	private String tipo;
	
	public Pokemon(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	//getter
	public String getNombre() {
		return this.nombre;
	}
	
	public String getTipo() {
		return this.tipo;
	}

}
