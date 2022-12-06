
package Questao7;
import Questao7.Java;


public class Teste {
    public static void main(String[] args){ 
    Java user1 = new Java("marcos",20, (float) 1.84,87,"masculino");
    
        System.out.println(user1.getNome()+" "+user1.calculeIMC());
    }
}
