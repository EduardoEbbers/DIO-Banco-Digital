package BancoDigital;

public interface IConta {
    void sacar(double valor);

    void depoistar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
