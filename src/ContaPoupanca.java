public class ContaPoupanca extends Conta{
    @Override
    public void imprimeExtrato() {
        System.out.println("===== Extrato Conta Poupanca");
        super.imprimirInfo();
    }

}
