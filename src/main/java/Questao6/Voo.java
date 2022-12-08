package Questao6;

import java.util.Arrays;
import java.util.Scanner;

public class Voo {

    String data;
    String horario;
    int[] cadeira = new int[100];
    int numeroDoVoo;

    public Voo(int numeroDeVoo, String data, String horario) {
        this.numeroDoVoo = numeroDeVoo;
        this.data = data;
        this.horario = horario;
    }

    public String proximoLivre() {
        for (int i = 0; i < this.cadeira.length; i++) {
            if (this.cadeira[i] == 0) {
                return "Proxima cadeira é a " + i;
            }
        }
        return "não há cadeira livre";

    }

    public boolean verifica(int num) {
        if(this.cadeira[num] == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean ocupa(int cadeira) {

        if (verifica(cadeira) == true) {
            
            this.cadeira[cadeira] = 1;
            
            return true;

        }
        return false;
    }

    public String vagas() {
        int[] vets = new int[this.cadeira.length];
        
        for (int i = 0, j = 0; i < this.cadeira.length; i++) {
            if (this.cadeira[i] == 0) {
                vets[j] = i;
                j++;
            }
        }

        return Arrays.toString(vets);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int[] getCadeira() {
        return cadeira;
    }

    public void setCadeira(int[] cadeira) {
        this.cadeira = cadeira;
    }

    public int getNumeroDoVoo() {
        return numeroDoVoo;
    }

    public void setNumeroDoVoo(int numeroDoVoo) {
        this.numeroDoVoo = numeroDoVoo;
    }
}
