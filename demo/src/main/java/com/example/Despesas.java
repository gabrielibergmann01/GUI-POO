package com.example;

import java.time.LocalDate;

public class Despesas extends Lancamento {

    private CategoriaDespesa categoria;

    public Despesa(String descricao, double valor,
                   LocalDate data, CategoriaDespesa categoria) {

        super(descricao, valor, data);

        if (categoria == null) {
            throw new IllegalArgumentException("Categoria invalida");
        }

        this.categoria = categoria;
    }

    public CategoriaDespesa getCategoria() {
        return categoria;
    }

    @Override
    public double calcularSaldo() {
        return -getValor();
    }
}


