
package Questao6;

public class Teste {
    public static void main(String[] args){
        Voo voo1 = new Voo(12,"05/12/2022","19:32");
        //Ocupando a cadeira
        System.out.println(voo1.ocupa(5) == true? "Cadeira ocupado com exito" : "Cadeira já ocupada");
        System.out.println(voo1.ocupa(8) == true? "Cadeira ocupado com exito" : "Cadeira já ocupada");
        //mostrnado o total de lugares vago no avião
        System.out.println("Estão livres as cadeira: "+voo1.vagas());
        //verificando se a cadeira está ou não ocupada
        System.out.println( voo1.verifica(8) == true ? "Não está ocupado" : "Está ocuppado");
        System.out.println( voo1.verifica(4) == true ? "Não está ocupado" : "Está ocuppado");
       
        
    }
}
