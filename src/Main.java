public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.imprimeExtrato();
        cc.depositar(500.0);
        cc.transferir(200.0, cp);

        cp.imprimeExtrato();
        cc.imprimeExtrato();
    }
}
