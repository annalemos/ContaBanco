package PckUnica;

class Banco {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("12345");
        ContaPoupanca contaPoupanca = new ContaPoupanca("67890");

        contaCorrente.depositar(500);
        contaPoupanca.depositar(200);

        contaCorrente.sacar(100);
        contaPoupanca.aplicarRendimento();

        contaCorrente.transferir(50, contaPoupanca);

        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
    }
}