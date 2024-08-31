public class ContaPoupanca extends Conta{
    @Override
    public void imprimeExtrato() {
        System.out.println("===== Extrato Conta Poupanca");
        super.imprimirInfo();
    }

    @Override
    public void fecharConta(int numero) {
        System.out.println("Conta fechada com sucesso");
    }
}
