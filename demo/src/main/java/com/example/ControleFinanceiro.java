package com.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class ControleFinanceiro {

    private ArrayList<Lancamento> lancamentos;

    public ControleFinanceiro() {
        lancamentos = new ArrayList<>();
    }

    // Cadastra uma receita
    public void incluirReceita(Receita receita) {

        if (receita == null) {
            throw new IllegalArgumentException("Receita invalida");
        }

        lancamentos.add(receita);
    }

    // cadastra uma despesa
    public void incluirDespesa(Despesa despesa) {

        if (despesa == null) {
            throw new IllegalArgumentException("Despesa invalida");
        }

        lancamentos.add(despesa);
    }

    // Consultar o saldo até a data atual
    public double consultarSaldoAteHoje() {

        double saldo = 0;

        LocalDate hoje = LocalDate.now();

        for (int i = 0; i < lancamentos.size(); i++) {

            Lancamento lancamento = lancamentos.get(i);

            if (!lancamento.getData().isAfter(hoje)) {
                saldo += lancamento.calcularSaldo();
            }
        }

        return saldo;
    }
}


