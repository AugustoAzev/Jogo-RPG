package jogo.personagens;

import jogo.objetos.Arma;

import java.util.ArrayList;

public class Heroi {
    int quantidadeHabilidades;
    ArrayList<Arma> armas;
    private int pontosDeVida;
    private int forca;
    private String categoria;

    //criando construtores (recebe o mesmo nome da classe)
    public Heroi(String categoria, int pontoDeVida, int forca, int quantidadeHabilidades){
        this.quantidadeHabilidades = quantidadeHabilidades;
        this.pontosDeVida = pontoDeVida;
        this.forca = forca;
        this.categoria = categoria;
    }
    public Heroi(String categoria, int pontosDeVida){
        this.categoria = categoria;
        this.pontosDeVida = pontosDeVida;
    }
    public Heroi(){
    }
    //PARA PEGAR ATRIBUTOS PRIVADOS
    public String getCategoria(){
        return "A categoria deste herói e: "+ this.categoria;
    }
    //PARA ALTERAR ATRIBUTOS PRIVADOS
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public int getForca(){
        return this.forca;
    }
    public void setForca(int forca){
        if (forca <= 0){
            this.forca = 1;
        }else if(forca > 10){
            this.forca = 10;
        }else{
            this.forca = forca;
        }
    }
}
