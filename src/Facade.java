public class Facade 
{
    private ClienteBanco cliente;
    private ContaBancaria conta;

    public Facade()
    {
        this.cliente = new ClienteBanco();
        this.conta = new ContaBancaria();
    }

    public void fazerDeposito(int quantidade, ClienteBanco cliente, ContaBancaria conta)
    {
        System.out.printf("Olá, o beneficiário de seu depósito é o(a) cliente %s\n",cliente.obterNomeCliente());
		System.out.printf("Você escolheu a conta %s\n", conta.obterNumeroConta());
		System.out.printf("O saldo da conta é: %d\n", conta.obterSaldo());
		System.out.printf("Depositando R$ %s\n", quantidade);
		conta.setSaldo(conta.getSaldo() + quantidade);
		System.out.printf("Depositado R$ %d na conta %s\n",quantidade, cliente.obterNomeCliente());
		System.out.printf("O saldo da conta é: R$ %s\n", conta.obterSaldo());
    }

    public ClienteBanco getCliente() 
    {
		return cliente;
	}

	public void setCliente(ClienteBanco cliente) 
    {
		this.cliente = cliente;
	}

	public ContaBancaria getConta() 
    {
		return conta;
	}

	public void setConta(ContaBancaria conta) 
    {
		this.conta = conta;
	}

}
