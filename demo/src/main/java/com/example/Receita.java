package com.example;

import java.time.LocalDate;

public class Receita extends Lancamento {

     private CategoriaReceita categoria;

    public Receita(String descricao, double valor, LocalDate data,
                   CategoriaReceita categoria) {

        super(descricao, valor, data);

        if (categoria == null) {
            throw new IllegalArgumentException("Categoria invalida");
        }

        this.categoria = categoria;
    }

    public CategoriaReceita getCategoria() {
        return categoria;
    }

    @Override
    public double calcularSaldo() {
        return getValor();
    }
}


