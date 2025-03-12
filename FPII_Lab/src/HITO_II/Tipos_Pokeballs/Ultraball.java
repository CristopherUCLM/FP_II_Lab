package HITO_II.Tipos_Pokeballs;

import HITO_II.Pokeball;
import HITO_II.Pokemon;

public class Ultraball extends Pokeball{
    private double potencia;
    public Ultraball(int energia,double potencia) {
        super(energia);
        this.potencia = potencia;
    }
    public double getPotencia() {return potencia;}
    
    public void setPotencia(double potencia) {this.potencia = potencia;}
    
    public boolean intentarCaptura(Pokemon pokemon){
		System.out.printf("Usando la ULTRABALL para intentar la captura de %s probabilidad : 50%% || integridad : %d || potencia : %f\n",pokemon.getNombre(), this.energia, this.potencia);
        int num = (int) (Math.random()*100);
        // Se garantiza la captura si la potencia es mayor o igual a 0.4, si la potencia es menor a 0.4, se calcula la
        // probabilidad de captura en función de la potencia, la probabilidad es 50% inicial, y aumenta 20% por cada fallo
        if(num<50+(potencia*100)||potencia >=0.4){
        	
        	System.out.printf("Felicidades! La captura de %s tuvo éxito!\n", pokemon.getNombre());
        	this.energia = 0; //Ya no puede capturara
            return true;
            
        }else {
        	
            potencia += 0.2;
            System.out.printf("Vaya! La captura de %s falló.\n", pokemon.getNombre());
            this.energia = this.energia -4; //Le quito integridad
            return false;
            
        }
    }
}