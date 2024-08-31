import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
        try{
            if (this.numero > 0 && this.agencia > 0)
                this.saldo += valor;
            else
                System.out.println("A conta que pretende depositar nao existe");
        } catch (Exception e) {
            throw new RuntimeException("Por favor, digite valores corretos.");
        }

    }

    @Override
    public void sacar(double valor) {
        try {
            if (this.numero > 0 && this.agencia > 0)
                this.saldo -= valor;
            else
                System.out.println("A conta que pretende sacar nao existe");
        } catch (Exception e) {
            throw new RuntimeException("Por favor, digite valores corretos.");
        }

    }

    @Override
    public void transferir(double valor, Conta destino) {
        try {
            if (this.numero > 0 && this.agencia > 0) {
                this.sacar(valor);
                destino.depositar(valor);
            } else
                System.out.println("Operacao invalida");
        } catch (Exception e) {
            throw new RuntimeException("Por favor, digite valores corretos.");
        }

    }

    protected void imprimirInfo(){
        System.out.println(String.format("Agencia: %d", this.getAgencia()));
        System.out.println(String.format("Numero: %d", this.getNumero()));
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
    }

    public boolean fechar(int numero){
        if (this.saldo > 0) {
            System.out.println("Precisa sacar todo dinheiro.");
            return false;
        }

        this.agencia = 0;
        this.numero = 0;
        return true;

    }
}
