import java.util.Date;
public class Conta {
	public int id;
	public int cpf;
    public String nome;
	public Date dataDeNascimento;
	
	
	
	
	public int getCpf() {
		return cpf;
	}
	


	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	
	
	
	public int getId() {
		return id;
	}

	public Conta(int id,int cpf, String nome,Date dataDeNascimento) {
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;
        this.nome = nome;
		this.id = id;
	}
	
	
	
}