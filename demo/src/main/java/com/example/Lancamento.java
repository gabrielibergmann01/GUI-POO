package com.example;

public class abstract Lancamento {

    private String descricao;
    private double valor;
    private LocalDate data;

    public Lancamento(String descricao, double valor, LocalDate data) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descricao invalida");
        }

        if (valor <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        }

        if (data == null) {
            throw new IllegalArgumentException("Data invalida");
        }

        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public abstract double calcularSaldo();

}

