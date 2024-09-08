package PckUnica;

class ContaCorrente extends Conta {
    private static final double TAXA_SAQUE = 0.10;

    public ContaCorrente(String numero) {
        super(numero);
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && (valor + TAXA_SAQUE) <= getSaldo()) {
            super.sacar(valor + TAXA_SAQUE);
            System.out.println("Taxa de saque: R$" + TAXA_SAQUE);
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }
}
