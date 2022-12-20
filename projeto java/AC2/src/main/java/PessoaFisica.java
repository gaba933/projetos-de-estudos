
public class PessoaFisica extends Cliente {
    
	private String cpf;
    private int quantParcelas;
    
    public PessoaFisica(String nome, Endereco endereco, String dataCadastro, String cpf, int quantParcelas) {
    	super(nome, endereco, dataCadastro);
    	this.cpf = cpf;
    	this.quantParcelas = quantParcelas;
    	
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getQuantParcelas() {
        return quantParcelas;
    }

    public void setQuantParcelas(int quantParcelas) {
        this.quantParcelas = quantParcelas;
    }
    
    
}
