package Questao9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Paises {

    String nome, capital;
    double dimenssao;
    String[] fronteira = new String[50];

    public Paises(String nome, String capital, double dimenssao) {
        this.nome = nome;
        this.capital = capital;
        this.dimenssao = dimenssao;
    }

    public boolean equals(final Paises outro) {

        if (getNome() == outro.getNome()) {
            return true;
        } else {
            return false;
        }
    }

    public String vizinhosCompartilhados(final Paises outro) {
        String compartilham = "[";
        for (int i = 0; i < this.fronteira.length; i++) {

            for (int b = 0; b < outro.fronteira.length; b++) {

                if (this.fronteira[i] == outro.fronteira[b]) {

                    compartilham += this.fronteira[i]+" ";
                }

            }

        }

        return compartilham+"]";
    }

    public void divisa(String[] divisa) {
        this.fronteira = divisa;
    }

    public String paizesVizinhos() {
        return Arrays.toString(this.fronteira);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getDimenssao() {
        return dimenssao;
    }

    public void setDimenssao(double dimenssao) {
        this.dimenssao = dimenssao;
    }

    public void setFronteira(String[] fronteira) {
        this.fronteira = fronteira;
    }
    
    public String getFronteira() {
        return Arrays.toString(fronteira);
    }

}
