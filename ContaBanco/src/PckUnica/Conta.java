package PckUnica;

abstract class Conta {

	
	
	    private String numero;
	    private double saldo;

	    public Conta(String numero) {
	        this.numero = numero;
	        this.saldo = 0.0;
	    }

	    public String getNumero() {
	        return numero;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    public void depositar(double valor) {
	        if (valor > 0) {
	            saldo += valor;
	            System.out.println("Depositado: R$" + valor);
	        } else {
	            System.out.println("Valor de depósito inválido.");
	        }
	    }

	    public void sacar(double valor) {
	        if (valor > 0 && valor <= saldo) {
	            saldo -= valor;
	            System.out.println("Sacado: R$" + valor);
	        } else {
	            System.out.println("Valor de saque inválido ou saldo insuficiente.");
	        }
	    }

	    public void transferir(double valor, Conta destino) {
	        if (valor > 0 && valor <= saldo) {
	            this.sacar(valor);
	            destino.depositar(valor);
	            System.out.println("Transferido: R$" + valor + " para a conta " + destino.getNumero());
	        } else {
	            System.out.println("Valor de transferência inválido ou saldo insuficiente.");
	        }
	    }

	    @Override
	    public String toString() {
	        return "Conta{" +
	               "numero='" + numero + '\'' +
	               ", saldo=" + saldo +
	               '}';
	    }

}

