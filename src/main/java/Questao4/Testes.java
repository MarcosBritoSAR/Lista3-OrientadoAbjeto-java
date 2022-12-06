
        
package Questao4;


public class Testes {
    
    public static void main(String[] args){
        Pessoas user1 = new Pessoas("Albert Einstein");
        Pessoas user2 = new Pessoas("Isaac Newton");
        
        user1.ajustaDataDeNascimento(14, 3, 1879);
        user2.ajustaDataDeNascimento(4,1,1643);
        
        System.out.println("Se "+user1.informaNome()+ " vivesse nos dias atuais, ele "
                + "teria exatamente "+ user1.infomaIdade());
        System.out.println("Se "+user2.informaNome()+ " vivesse nos dias atuais, ele "
                + "teria exatamente "+ user2.infomaIdade());
    }
}
