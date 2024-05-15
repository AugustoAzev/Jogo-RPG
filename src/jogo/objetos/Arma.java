package jogo.objetos;

public class Arma {
    public String tipo;
    public int bonusDano;
    public boolean longoAlcance;

    public Arma(String tipo, int bonusDano, boolean longoAlcance){
        this.tipo = tipo;
        this.bonusDano = bonusDano;
        this.longoAlcance = longoAlcance;
    }

}
