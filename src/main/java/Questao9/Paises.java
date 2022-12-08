
package Questao9;



public class Paises {
    String nome, capital;
    double dimenssao;
    String[] fronteira = new String[50];
    
    public Paises(String nome, String capital, double dimenssao){
       this.nome = nome;
       this.capital = capital;
       this.dimenssao = dimenssao;
   }
    
    public boolean equals(final Paises outro){
        if(getNome()== outro.getNome()){
            return true;
        }else{
            return false;
        }
    }
    
    public String[] vizinhosCompartilhados(final Paises outro){
        String[] compartilham = new String[this.fronteira.length];
        for(int i =0,aux = 0; i< this.fronteira.length; i++){
            for(int b = 0; b < this.fronteira.length; b++ ){
                if(this.fronteira[i] == outro.fronteira[b]){
                    compartilham[aux] = this.fronteira[i];
                    aux++;
                }
            }
        }
        return compartilham;
    }
    public void divisa(String[] divisa{
        setFronteira(divisa);
    }
    
    public String[]  paizesVizinhos(){
        return getFronteira();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getDimenssao() {
        return dimenssao;
    }

    public void setDimenssao(double dimenssao) {
        this.dimenssao = dimenssao;
    }

    public String[] getFronteira() {
        return fronteira;
    }

    public void setFronteira(String[] fronteira) {
        this.fronteira = fronteira;
    }

    void divisa(String uruguai, String argentina, String paraguai, String bolívia, String peru, String colômbia, String venezuela, String guiana, String _Suriname) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
   
   
}
