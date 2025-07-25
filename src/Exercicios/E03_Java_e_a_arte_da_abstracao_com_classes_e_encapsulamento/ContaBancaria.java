package Exercicios.E03_Java_e_a_arte_da_abstracao_com_classes_e_encapsulamento;

public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private double limite;
    private double chequeEspecialInicial;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;

        if (saldo <= 500)  setChequeEspecial(50.0);
        else setChequeEspecial(saldo / 2);

        this.limite = saldo + chequeEspecial;

        System.out.println("Conta criada com sucesso.");
    }

    private double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private double getChequeEspecial() {
        return chequeEspecial;
    }

    private double getLimite() {
        return limite;
    }

    private void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
        double chequeEspecialInicial = chequeEspecial;
    }

    private void setLimite() {
        this.limite = getSaldo() + chequeEspecial;
    }

    //Consultar saldo
    public void consultarSaldo() {
        System.out.printf("\nSaldo: %.2f\n", getSaldo());;
    }

    //consultar cheque especial
    public double consultarChequeEspecial() {
        return this.getChequeEspecial();
    }

    //Depositar dinheiro;
    public void depositarDinheiro (double valor){
        this.saldo += valor;
        setLimite();
        System.out.printf("\nSaldo depositado com sucesso.\nNovo limite: %.2f\n", this.getLimite());
    }

    //Sacar dinheiro;
    public void sacarDinheiro (double valor){
        if (realizarMovimentacao(valor)) System.out.printf("\nSaque realizado com sucesso.\nNovo limite: %.2f\n", getLimite());

    }

    //Pagar um boleto.
    public void pagarBoleto(double valor){
        if (realizarMovimentacao(valor)) System.out.printf("\nPagamento realizado com sucesso.\nNovo limite: %.2f\n", getLimite());
    }

    private boolean realizarMovimentacao(double valor) {
        if (valor > this.getLimite()) return false;
        else if (valor <= this.getSaldo())  this.saldo -= valor;
        else {
            double diferenca = valor - this.getSaldo();
            setSaldo(0);
            this.chequeEspecial -= diferenca;
            cobrarTaxa();
        }
        setLimite();
        return true;
    }

    //Verificar se a conta está usando cheque especial.
    public boolean verificarChequeEspecial() {
        if (this.chequeEspecial < chequeEspecialInicial) return true;
        else return false;
    }

    private void cobrarTaxa(){
        this.chequeEspecialInicial = chequeEspecial - (chequeEspecialInicial * 0.2);
        setLimite();
    }

    public void consultarLimite(){
        System.out.printf("\nLimite: %.2f\n", getLimite());
    }
}