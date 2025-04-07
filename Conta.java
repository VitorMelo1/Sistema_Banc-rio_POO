public abstract class Conta implements BancoInterface {
    protected double saldo;
    protected String nomeTitular;

    public Conta(String nomeTitular) {
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de deposito invalido!");
        }
    }

    public void transferir(double valor, BancoInterface contaDestino) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferencia de R$" + valor + " realizada com sucesso!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para transferencia!");
        } else {
            System.out.println("Valor de transferencia invalido!");
        }
    }


    public double getSaldo() {
        return saldo;
    }
    public String getTitular() {
        return nomeTitular;
    }

}
