public class ContPoupanca extends Conta {
    public ContPoupanca(String nomeTitular) {
        super(nomeTitular);
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque!");
        } else {
            System.out.println("Valor de saque invalido!");
        }

    }
}
