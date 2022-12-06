package Questao7;

public class Java {

    String nome;
    int idade;
    float alturaCM;
    float peso;
    String sexo;

    public Java(String nome, int idade, float altura, float peso, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.alturaCM = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String calculeIMC() { //Desnecessário de mais
        float a;
        a = this.peso / (this.alturaCM * this.alturaCM);

        if (a < 18.5) {
            return "Abaixo do peso";
        } else if (a > 18.5 && a <= 25) {
            return "peso normal";
        } else if (a > 25 && a <= 30) {
            return "Acima do peso";
        } else {
            return "Obesidade";
        }

    }

    public String toString() {
        return getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return alturaCM;
    }

    public void setAltura(float altura) {
        this.alturaCM = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
