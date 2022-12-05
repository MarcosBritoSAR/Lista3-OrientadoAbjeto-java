package Questao3;

public class Conta {

    private double saldo;
    private String tipo;

    public Conta(double valorInicial) {
        setSaldo(valorInicial);

    }

    public Conta(double valorInicial, String tipo) {
        setSaldo(valorInicial);
        setTipo(tipo);

    }
//-----------------------------------------------------

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean depositar(double valor) {
        if (getTipo() == "corrente") { //Se for tipo corrente
            if (valor <= 1000) {
                setSaldo(valor + getSaldo());
                return true;
            } else {
                System.out.println("Você não pode depositar mais que R$ 1000,00 na conta corrente");
                return false;
            }

        } else {
            setSaldo(valor + getSaldo());
        }
        return true;
    }

    public boolean sacar(double valor) {
        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Conta contaDestino) {

        if (getTipo() == "corrente") {
            contaDestino.setSaldo(valor);
            return true;

        } else {
            return false;
        }
    }
}
