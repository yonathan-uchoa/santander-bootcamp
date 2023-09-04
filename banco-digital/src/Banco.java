import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Banco {

	public Banco(){
		this.contas = new ArrayList<Conta>();
	}
	private String nome;
	private List<Conta> contas;

	public void adicionarCliente(Conta conta){
		contas.add(conta);
	}
	public void numeroClientes(){
		System.out.println("Numero total de clientes: " + contas.size());
	}

	public void nomeClientes(){
		System.out.println("Nome dos clientes:");
		for(Conta conta:contas){
			System.out.println(conta.getCliente().getNome());
		}
	}
}
