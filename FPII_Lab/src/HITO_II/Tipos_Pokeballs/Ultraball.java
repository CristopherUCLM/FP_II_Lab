package Tipos_Pokeballs;

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
        int num = (int) (Math.random()*100);
        // Se garantiza la captura si la potencia es mayor o igual a 0.4, si la potencia es menor a 0.4, se calcula la
        // probabilidad de captura en función de la potencia, la probabilidad es 50% inicial, y aumenta 20% por cada fallo
        if(num<50+(potencia*100)||potencia >=4){
            return true;
        }else {
            potencia += 0.2;
            return false;
        }
    }
    public double getPotencia(){
        return potencia;
    }
    public void setPotencia(double potencia){
        this.potencia = potencia;
    }
}