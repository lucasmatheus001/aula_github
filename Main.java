import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Menu mainMenu =  new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes"));
		System.out.println(mainMenu.getSelection() + "foi selecionada");
		System.out.println("Fim");

		if(mainMenu.getSelection() == 1){
			Menu cli = new Menu("Cliente", Arrays.asList("Cadastrar Conta", "Alterar Dados"));
			if(cli.getSelection() == 2){
				System.out.println("Digite o cpf do cliente: ");
				Scanner s = new Scanner(System.in);
				String cpf = s.nextLine();
				
				
				Menu dados = new Menu("Dados a alterar", Arrays.asList("Nome", "CPF"));
				if(dados.getSelection() == 1){
					System.out.println("Digite o novo nome do cliente: ");
				    Scanner nome = new Scanner(System.in);
					String no = nome.nextLine();
					Clientes.getCliente(cpf).setNome(no);
				}
				else if(dados.getSelection() == 2){
					System.out.println("Digite o novo cpf do cliente: ");
				    Scanner cp = new Scanner(System.in);
					String c = cp.nextLine();
					Clientes.getCliente(cpf).setCPF(c);
				}
			}
		}
	}

}
