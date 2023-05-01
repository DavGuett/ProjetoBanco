package com.banco.dominio;

public abstract class Conta {
    public Conta(String numeroDaConta, String titularDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.titularDaConta = titularDaConta;
        this.saldo = saldo;
    }

    private String numeroDaConta;
    private String titularDaConta;

    private double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
    }
    public void retirar(double valor) {
        this.saldo -= valor;
    }
    public double checarSaldo () {
        return saldo;
    }
}
