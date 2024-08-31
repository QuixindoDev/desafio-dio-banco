public class ContaCorrente extends Conta{
    @Override
    public void imprimeExtrato() {
        System.out.println("===== Extrato Conta Corrente =====");
        super.imprimirInfo();
    }

    @Override
    public void fecharConta(int numero) {
        fechar(numero);
        System.out.println("Conta fechada com sucesso");
    }
}
