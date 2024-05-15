import jogo.mapas.Masmorra;
import jogo.personagens.Heroi;
import jogo.personagens.Monstro;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Masmorra temploDaAgua = new Masmorra( 20, new ArrayList<Monstro>());

        temploDaAgua.abrirPorta();
    }
}
