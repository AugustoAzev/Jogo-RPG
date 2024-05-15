package jogo.mapas;
import jogo.personagens.Monstro;
import java.util.ArrayList;
import java.util.Random;

public class Masmorra {
    public int quantidadeSalas;
    public ArrayList<Monstro> monstros;
    private int quantidadeArmadilhas;

    public void abrirPorta(){
        System.out.println("A porta se abriu!");
        Monstro monstro = revelarMonstros();
        if (monstro == null){
            System.out.println("Ufa, voce esta salvo!");
        }else{
            System.out.println("Agora é cair no pau!");
        }
    }
    private Monstro revelarMonstros(){
        Random sorteio = new Random();
        int numeroSorteado = sorteio.nextInt(3);
        if(numeroSorteado == 0){
            return null;
        }else{
            return new Monstro(10, 2);
        }
    }

    public Masmorra(int quantidadeSalas, ArrayList<Monstro> monstros){
        this.monstros = monstros;
        this.quantidadeSalas = quantidadeSalas;

        Random sorteio = new Random();
        this.quantidadeArmadilhas = sorteio.nextInt(10);
    }
}
