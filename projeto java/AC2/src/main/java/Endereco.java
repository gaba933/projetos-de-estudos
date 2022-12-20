public class Endereco {
    
    private String rua;
    private int numero;
    private String bairro;
    private String CEP;
    private String cidade;
    private String estado;

    public Endereco(String rua, int numero, String bairro, String CEP, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.CEP = CEP;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String paraString(){
        
        String info="";
        info += "\nRua: " + this.rua;
        info += "\nNumero: " + this.numero;
        info += "\nBairro: " + this.bairro;
        info += "\nCEP: " + this.CEP;
        info += "\nCidade: " + this.cidade;
        info += "\nEstado: " + this.estado;
        
        return info;
    }
    
}
