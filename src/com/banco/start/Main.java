package com.banco.start;

import com.banco.dominio.ContaCorrente;

public class Main {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente("2504","david", 100);
        System.out.println(conta1.checarSaldo());
        conta1.depositar(50);
        System.out.println(conta1.checarSaldo());
    }
}