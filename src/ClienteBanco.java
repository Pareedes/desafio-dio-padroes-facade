public class ClienteBanco
{
    private String nome;

    public String obterNomeCliente()
    {
        return this.nome;
    }

    public ClienteBanco(){}

    public ClienteBanco(String nome)
    {
        this.nome = nome;
    }
}
