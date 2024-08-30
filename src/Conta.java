import lombok.Getter;

@Getter
public abstract class Conta implements IConta{
    protected int agencia;
    protected int numero;
    private double saldo;

    protected static final int AGENCIA_PADRAO = 1;//ID da agencia
    private static int SEQUENCIAL = 1;//Incrementador do numero da agencia

    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    protected void imprimirInfo(){
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
