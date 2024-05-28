package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizações;

    public int getTotalVisualizações() {
        return totalVisualizações;
    }

    public void setTotalVisualizações(int totalVisualizações) {
        this.totalVisualizações = totalVisualizações;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if(totalVisualizações > 100){
            return 4;
        }else{
            return 2;
        }
    }
}
