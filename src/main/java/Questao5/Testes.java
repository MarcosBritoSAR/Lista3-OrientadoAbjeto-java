
        
package Questao5;



public class Testes {
    
    public static void main(String[] args){
        Pessoas user1 = new Pessoas(14, 3, 1879,"Albert Einstein");
        Pessoas user2 = new Pessoas(4,1,1643,"Isaac Newton");
               
        System.out.println("Se "+user1.informaNome()+ " vivesse nos dias atuais, ele "
                + "teria exatamente "+ user1.infomaIdade());
        System.out.println("Se "+user2.informaNome()+ " vivesse nos dias atuais, ele "
                + "teria exatamente "+ user2.infomaIdade());
    }
}
