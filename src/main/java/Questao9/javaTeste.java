package Questao9;

import java.util.Arrays;

public class javaTeste {

    public static void main(String[] args) {
        Paises brasil = new Paises("Brasil", "Brasília", 8000.516);
        Paises argentina = new Paises("Argentina", "Buenos Aires", 2000.780);

        brasil.divisa(new String[]{"Uruguai", "Argentina", "Paraguai", "Bolívia", "Peru", "Colômbia", "Venezuela", "Guiana", " Suriname"});
        argentina.divisa(new String[]{"Brasil", "Uruguai", "Paraguai", "Bolívia", "Chile"});
        //Tenho que passar os pises como objeto, por parâmetro não consigo

        System.out.println("------------Brasil é igual a argentina?-------------\n");
        System.out.println(brasil.equals(argentina) == true ? "Mesmo país" : "Paises diferentes\n");

        System.out.println("------------Brasil é igual a Brasil?-------------\n");
        System.out.println(brasil.equals(brasil) == true ? "Mesmo país" : "Paises diferentes\n");
        // System.out.println(brasil.vizinhosCompartilhados(argentina));

        System.out.println("------------PAIS_1-------------\n");
        System.out.println(" Pais: " + brasil.getNome() + "\n"
                + " Capital: " + brasil.getCapital() + "\n"
                + " Dimenssao: " + brasil.getDimenssao() + "\n"
                + " Faz fronteira com:" + brasil.getFronteira());

        System.out.println("------------PAIS_2-------------\n");

        System.out.println(" Pais: " + argentina.getNome() + "\n"
                + " Capital: " + argentina.getCapital() + "\n"
                + " Dimenssao: " + argentina.getDimenssao() + "\n"
                + " Faz fronteira com:" + argentina.getFronteira());

        System.out.println("Listas de paises que fazem fronteiras em comum: " + brasil.vizinhosCompartilhados(argentina));

    }

}
