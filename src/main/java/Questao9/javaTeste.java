package Questao9;

public class javaTeste {

    public static void main(String[] args) {
        Paises brasil = new Paises("Brasil", "Brasília", 8000.516);
        Paises argentina = new Paises("Argentina", "Buenos Aires", 2000.780);
        
        brasil.divisa("Uruguai", "Argentina", "Paraguai", "Bolívia", "Peru", "Colômbia", "Venezuela", "Guiana" ," Suriname");
        //Tenho que passar os pises como objeto, por parâmetro não consigo
        
        System.out.println(brasil.equals(argentina) == true? "Mesmo país" : "Paises diferentes");
        System.out.println(brasil.equals(brasil) == true? "Mesmo país" : "Paises diferentes");

    }

}
