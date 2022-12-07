
package Questao8;
public class Teste {
    public static void main(String[] args){
        Funcionario user1 = new Funcionario("maria",108055,4000,"10/10/2012","080552445545");
        
        System.out.println(
                  " O(a) funcionário(a): "+ user1.getNome()+"\n"
                + " Matricula: "+ user1.getMatricula()+"\n" 
                + " Data de admissão: "+ user1.getDataDeAdmicao()+"\n" 
                + " CPF: "+ user1.getCPF()+"\n");
        
        System.out.println("Antes do aumento, ele(a):\n"
                + " recebia mensalmente bruto: " + user1.getSalario()+"\n" 
                + " Recebia mensalmente com desconto: "+ user1.calcularGanhoLiquidoMensal()+"\n" 
                + " Recebia anualmente bruto: "+ user1.calcularGanhoBrutoAnual()+"\n" 
                + " Recebia anualmente com desconto: "+ user1.calcularGanhoLiquidoAnual()+"\n");
        
        user1.receberAumento(1500);
        
        System.out.println("Depois do aumento, ele(a) passou a receber: \n"
                + " mensalmente bruto: " + user1.getSalario()+"\n" 
                + " mensalmente com desconto: "+ user1.calcularGanhoLiquidoMensal()+"\n" 
                + " anualmente bruto: "+ user1.calcularGanhoBrutoAnual()+"\n" 
                + " anualmente com desconto: "+ user1.calcularGanhoLiquidoAnual()+"\n");
    }
    
}
