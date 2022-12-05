
package Questao1;

public class Empregado {
    String nome;
    String sobrenome;
    double salario;
    
    public Empregado(String nome,String sobrenome, double salario){
        setNome(nome);
        setSobrenome(sobrenome);
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
