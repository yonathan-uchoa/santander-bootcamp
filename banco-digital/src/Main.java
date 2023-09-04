
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		Banco santander = new Banco();
		santander.setNome("Santander");
		santander.adicionarCliente(cc);
		santander.adicionarCliente(poupanca);

		santander.numeroClientes();
		santander.nomeClientes();
	}

}
