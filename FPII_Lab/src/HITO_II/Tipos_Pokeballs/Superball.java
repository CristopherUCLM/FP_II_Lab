package HITO_II.Tipos_Pokeballs;
import HITO_II.Pokeball;
import HITO_II.Pokemon;

public class Superball extends Pokeball{
    private int rachas;

    public int getRachas() {return rachas;}
    public void setRachas(int rachas) {this.rachas = rachas;}
    public Superball(int energia,int rachas) {
        super(energia);
        this.rachas = rachas;
    }

    public boolean intentarCaptura(Pokemon pokemon){
        int num = (int) (Math.random()*100);
        // Si el número aleatorio es menor que 20 + (rachas * 10), se captura el Pokémo y la probabilidad de captura
        // aumenta con cada intento fallido (rachas), si se captura, rachas=0, sino, se incrementa el contador de rachas
        if(num<20+(rachas*10)){
            rachas=0;
            return true;

        }else{
            rachas++;
            return false;
        }
    }

}