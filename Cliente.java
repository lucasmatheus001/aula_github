import java.util.ArrayList;


public class Cliente {
	public String nome;
	public int cpf;
	
    ArrayList<Conta> contas = new ArrayList<Conta>();
	
    public ArrayList<Conta> getContas() {
		return contas;
	}

	public Cliente (int cpf,String nome, double conta) {
		this.nome = nome;
		this.cpf = cpf;
        this.conta = conta;
	}

}