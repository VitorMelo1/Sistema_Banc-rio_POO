public class Prints {
    public void apresentacao(){
        System.out.println("Bem-vindo ao sistema bancário!");
    }
    public void menu(){
        System.out.println("Selecione uma opção:");
        System.out.println("1. Criar conta");
        System.out.println("2. listar contas");
        System.out.println("3. Depositar");
        System.out.println("4. Sacar");
        System.out.println("5. Transferir");
        System.out.println("6. Consultar saldo");
        System.out.println("7. Sair");
    }
    public void contaCriada(String tipoConta, String nomeTitular){
        System.out.println("Conta " + tipoConta + " criada com sucesso para " + nomeTitular + "!");
    }
    
}
