package Questao4;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Pessoas {

    Scanner leia = new Scanner(System.in);
    int idadeA = 0, idadeM = 0, idadeD = 0;

    int diaA, diaN;
    int mesA, mesN;
    int anoA, anoN;
    
    int qntMes = 0, qntAno = 0, qntDia = 0;
    String nome;

    public Pessoas(String nome) {
        this.nome = nome;
    }

    public String infomaIdade() {
        calculeIdade();
        return +this.qntAno + " anos, " + this.qntMes + " meses e " + this.qntDia + " dias";
    }

    public String informaNome() {
        return this.nome;
    }

    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        this.diaN = dia;
        this.mesN = mes;
        this.anoN = ano;
    }

    public void calculeIdade() {
        Calendar cal = new GregorianCalendar();
        
        this.diaA = cal.get(Calendar.DAY_OF_MONTH);
        this.mesA = cal.get(Calendar.MONTH);
        this.anoA = cal.get(Calendar.YEAR);

        if (dataValida(this.diaN, this.mesN, this.anoA) == 1) {
            while (this.mesN < this.mesA - 1 || this.anoN < this.anoA) {
                this.mesN++;
                this.qntMes++;
                if (this.qntMes == 12) {
                    this.qntMes = 0;
                    this.qntAno++;
                }

                if (this.mesN == 12) {
                    this.anoN++;
                    this.mesN = 0;
                }
            }
            if (this.diaN == this.diaA) {
                this.qntMes++;
                this.qntDia = 0;
            } else if (this.diaN < this.diaA) {
                this.qntMes++;
                this.qntDia = this.diaA - this.diaN;
            } else {
                this.qntDia = diaNoMes((this.mesA - 1), this.anoA) + (this.diaA - diaN);
            }

        } else {
            System.out.println("Data inválida");
        }

    }

    public int bissexto(int ano) { //verifico sse o ano é bissexto ou n
        if (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int dataValida(int ano, int mes, int dia) {
        if (dia < 1 && dia > 31 && mes > 12) {
            return 0;
        }
        if (dia == 31 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
            return 0;
        }
        if (mes == 2 && dia > 29) {
            return 0;
        }
        if (mes == 2 && dia == 29 && bissexto(ano) == 0) {
            return 0;
        }

        return 1;
    }

    public int diaNoMes(int mes, int ano) {
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            return 31;
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        }
        if (bissexto(ano) == 1) {
            return 29;
        }
        return 28;
    }

}
