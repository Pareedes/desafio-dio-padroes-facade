public class Aplicacao 
{
    public static void main(String[] args) 
    {
		ClienteBanco cliente = new ClienteBanco("Gabriel Paredes");
		ContaBancaria conta = new ContaBancaria("1111-2");

		Facade facade = new Facade();
		facade.fazerDeposito(150, cliente, conta);
	}
}
