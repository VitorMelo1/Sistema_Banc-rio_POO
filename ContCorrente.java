public class ContCorrente extends Conta {
    private final double TAXA_SAQUE = 0.10;

    public ContCorrente(String nomeTitular) {
        super(nomeTitular);
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor + TAXA_SAQUE;
            System.out
                    .println("Saque de R$" + valor + " realizado com sucesso! Taxa de R$" + TAXA_SAQUE + " aplicada.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque!");
        } else {
            System.out.println("Valor de saque invalido!");
        }
    }
}