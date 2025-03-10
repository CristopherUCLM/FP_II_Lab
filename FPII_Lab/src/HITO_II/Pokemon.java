package HITO_II;

public class Pokemon {
	
	private String nombre;
	private String tipo;
	protected int nivel, velocidad, salud;
	
	public Pokemon(String nombre, String tipo, int nivel, int velocidad, int salud) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.nivel = nivel;
		this.velocidad = velocidad;
		this.salud = salud;
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
	
	public void setSalud(int salud) {
		this.salud = salud;
	}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setTipo(String tipo) {this.tipo = tipo;}
	public void setNivel(int nivel) {this.nivel = nivel;}
	public void setVelocidad(int velocidad) {this.velocidad = velocidad;}
}
