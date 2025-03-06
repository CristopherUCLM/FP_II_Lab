package HITO_II;

public class Pokemon {
	
	private String nombre;
	private String tipo;
	protected int nivel, velocidad, salud;
	
	public Pokemon(String nombre, String tipo, int n, int v, int s) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.nivel = n;
		this.velocidad = v;
		this.salud = s;
	}
	
	//getter
	public String getNombre() {
		return this.nombre;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public int getNivel() {
		return this.nivel;
	}
	
	public int getVelocidad() {
		return this.velocidad;
	}
	
	public int getSalud() {
		return this.salud;
	}
	
	public void setSalud(int s) {
		this.salud = s;
	}

}
