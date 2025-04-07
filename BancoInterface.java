public interface BancoInterface {
    // define the methods that will be implemented by the Banco class
    void depositar(double valor);
    void sacar(double valor);
    double getSaldo();
    String getTitular();
    void transferir(double valor, BancoInterface contaDestino);
    
}