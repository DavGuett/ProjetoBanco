package com.banco.dominio;

public class ContaCorrente extends Conta {
    public ContaCorrente(String numerodaConta, String titularDaConta, double saldoInicial) {
        super(numerodaConta, titularDaConta, saldoInicial);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }
}
