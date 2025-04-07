# Sistema Bancário em Java 💳

Este projeto é um sistema bancário simples em Java, com suporte para **contas correntes** e **contas poupança**, utilizando conceitos de **Programação Orientada a Objetos (POO)** como **abstração**, **encapsulamento**, **herança** e **polimorfismo**.

---

## 🔧 Estrutura de Arquivos

- `Main.java` → Classe principal, gerencia o menu, entrada de dados e operações do sistema.
- `BancoInterface.java` → Interface que define o contrato com métodos comuns para todas as contas.
- `Conta.java` → Classe abstrata base para contas, implementa métodos comuns.
- `ContCorrente.java` → Subclasse que representa conta corrente com taxa de saque.
- `ContPoupanca.java` → Subclasse que representa conta poupança (sem taxa de saque).
- `Prints.java` → Classe utilitária para mensagens e organização de saída.

---

## 📄 Funcionalidades

- Criação de conta (Corrente ou Poupança)
- Depósito
- Saque (com ou sem taxa, dependendo do tipo de conta)
- Transferência entre contas
- Consulta de saldo
- Visualização de todas as contas cadastradas

---

## 🎓 Conceitos de POO Utilizados

| Conceito        | Como foi aplicado |
|----------------|-------------------|
| **Abstração**        | Conta bancária representada em forma de objeto com atributos e comportamentos. |
| **Encapsulamento**   | Atributos protegidos e acesso via getters/setters. |
| **Herança**          | `ContCorrente` e `ContPoupanca` herdam de `Conta`. |
| **Polimorfismo**     | Métodos como `sacar` e `transferir` funcionam de forma diferente em cada subclasse. |

---

## 🚀 Como Executar

1. Compile todos os arquivos:
```bash
javac Main.java Prints.java BancoInterface.java Conta.java ContCorrente.java ContPoupanca.java
```

2. Rode o programa:
```bash
java Main
```

---

## 🤖 Contas de exemplo pré-cadastradas

Ao iniciar o programa, já existem 3 contas registradas:

1. João (Corrente) - Saldo: R$150.00
2. Maria (Poupança) - Saldo: R$300.00
3. Carlos (Corrente) - Saldo: R$50.00

Essas contas podem ser utilizadas para testes de saque, depósito, transferência e consulta.

---

## 📈 Exemplo de saída

```
Bem-vindo ao sistema bancário!
Selecione uma opção:
1. Criar conta
2. listar contas
3. Depositar
4. Sacar
5. Transferir
6. Consultar saldo
7. Sair
```

---

## 💡 Sugestões de melhorias

- Implementar IDs únicos para as contas
- Adicionar autenticação (simulação de login)
- Melhorar exibição de menus com `switch-case` dinâmico

---

## 👨‍🎓 Autor

Sistema desenvolvido para fins acadêmicos com foco em exercício de POO em Java.  
Sinta-se livre para adaptar e evoluir o projeto.

