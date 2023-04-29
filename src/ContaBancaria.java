public class ContaBancaria 
{
    private String conta;
    private int saldo;

    public int depositar(int valor)
    {
        return this.setSaldo(this.getSaldo() + valor);
    }

    public String obterNumeroConta()
    {
        return this.conta;
    }

    public int obterSaldo()
    {
        return this.getSaldo();
    }

    public ContaBancaria(){}

    public ContaBancaria(String conta)
    {
        this.conta = conta;
    }

    public int getSaldo()
    {
        return saldo;
    }

    public int setSaldo(int saldo)
    {
        this.saldo = saldo;
        return saldo;
    }
}
