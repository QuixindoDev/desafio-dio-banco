public interface IConta {
    void depositar(double valor);
    void sacar(double valor);
    void transferir(double valor, Conta destino);
    void imprimeExtrato();
    void fecharConta(int numero);

}
