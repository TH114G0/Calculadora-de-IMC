package br.com.alura.service;

import br.com.alura.model.Pessoa;

public class CalcularIMC {
    public static double calcular(Pessoa pessoa) {
        return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
    }
}
