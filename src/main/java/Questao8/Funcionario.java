package Questao8;

public class Funcionario {

    String nome;
    int matricula;
    double salario;
    String dataDeAdmicao;
    String CPF;

    public Funcionario(String nome, int matricula, double salario, String data, String cpf) {

        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.dataDeAdmicao = data;
        this.CPF = cpf;
    }

    public void receberAumento(double value) {
        this.salario += value;
    }

    public double calcularGanhoBrutoAnual() {
        return this.salario * 12;
    }

    public double calcularImposto() {
        double imposto;
        imposto = this.salario * 0.11;

        if (this.salario > 2500) {
            imposto += (this.salario - 2500) * 0.175;
        }

        return imposto * 12;
    }

    public double calcularGanhoLiquidoMensal() {
        return this.salario - (calcularImposto() / 12);
    }

    public double calcularGanhoLiquidoAnual() {
        return (this.salario * 12) - calcularImposto();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataDeAdmicao() {
        return dataDeAdmicao;
    }

    public void setDataDeAdmicao(String dataDeAdmicao) {
        this.dataDeAdmicao = dataDeAdmicao;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}
