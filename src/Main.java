
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		Conta salario = new ContaSalario(venilton);// Criação da conta salário

		System.out.println("----------------------Extrato inicial---");
		cc.imprimirExtrato();
		System.out.println("----------------------Extrato após depósito----");
		cc.depositar(100);
		cc.imprimirExtrato();
		System.out.println("----------------------Extrato após transferencia---");
		cc.transferir(100, poupanca);
		cc.imprimirExtrato();

		// Operações na conta salário
        salario.depositar(200); // Depósito na conta salário
        salario.transferir(50, cc); // Transferência para a conta corrente
				
		poupanca.imprimirExtrato();
		salario.imprimirExtrato(); // Impressão do extrato da conta salário
	}

}
