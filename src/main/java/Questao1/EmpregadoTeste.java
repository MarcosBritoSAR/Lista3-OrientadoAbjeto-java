


package Questao1;

import Questao1.Empregado;
public class EmpregadoTeste {
    public static void main(String[] args){
        Empregado pessoa1  = new Empregado("Marcos", "Brito", 2500);
        Empregado pessoa2  = new Empregado("Guatavo", "Brito", 1500);
        
        System.out.println("O salário anual de "+pessoa1.getNome()+ " é de: R$:" + pessoa1.getSalario()*12);
        System.out.println("O salário anual de "+pessoa2.getNome()+ " é de: R$:" + pessoa2.getSalario()*12);
        
        System.out.println("\n");
        
        System.out.println("Com o aumento de 10% do salário de "+pessoa1.getNome()+", ele passará a ganhar R$:"+((pessoa1.getSalario()*12)+((pessoa1.getSalario()*12)*0.1)));
        System.out.println("Com o aumento de 10% do salário de "+pessoa2.getNome()+", ele passará a ganhar R$:"+((pessoa2.getSalario()*12)+((pessoa2.getSalario()*12)*0.1)));
   
    }
}
