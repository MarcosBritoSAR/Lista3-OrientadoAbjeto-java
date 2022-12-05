package Questao3;

public class Main {

    public static void main(String[] args) {
        Conta saldoCorrente = new Conta(0, "corrente");
        Conta saldoPolpanca = new Conta(0, "polpanca");

        System.out.println((saldoCorrente.depositar(1500) == true) ? "Exito" : "falha");
        System.out.println((saldoPolpanca.depositar(1500) == true) ? "Exito" : "falha");
        System.out.println((saldoPolpanca.depositar(98.52) == true) ? "Exito" : "falha");
        System.out.println((saldoPolpanca.sacar(100) == true) ? "Exito" : "falha");
        System.out.println((saldoCorrente.transferir(1800, saldoPolpanca) == true) ? "Exito" : "falha");
        System.out.println((saldoPolpanca.transferir(1800, saldoCorrente) == true) ? "Exito" : "falha");
        System.out.println((saldoCorrente.sacar(1000) == true) ? "Exito" : "falha");
        System.out.println((saldoPolpanca.sacar(1000) == true) ? "Exito" : "falha");

    }
}
