package br.com.alura.service;

import br.com.alura.model.PessoaModel;

public class CalcularIMCService {
    public static double calcular(PessoaModel pessoaModel) {
        return pessoaModel.getPeso() / (pessoaModel.getAltura() * pessoaModel.getAltura());
    }
}
