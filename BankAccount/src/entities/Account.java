package entities;

public class Account {

    private int numConta;
    private String titular;
    private double saldo;

    public Account(int numConta, String titular) {
        this.numConta = numConta;
        this.titular = titular;
    }

    public Account(int numConta, String titular, double depositoInicial) {
        this.numConta = numConta;
        this.titular = titular;
        fazerDeposito(depositoInicial);
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void fazerDeposito(double valorDeposito) {
        saldo += valorDeposito;
    }

    public void fazerSaque(double valorSaque) {
        saldo -= valorSaque + 5.00;
    }

    @Override
    public String toString() {
        return "Account: " + numConta + ", Holder: " + titular + ", Balance: R$" + String.format("%.2f", saldo);
    }
}
