package br.com.alura.model;

public class PessoaModel {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome não deve ser nulo e nem vazio!");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0 || idade > 120) {
            throw new IllegalArgumentException("A idade deve ser um valor positivo e razoável.");
        }
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("A altura deve ser um valor positivo e razoável.");
        }
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0 || peso > 320) {
            throw new IllegalArgumentException("O peso deve ser um valor positivo e razoável.");
        }
        this.peso = peso;
    }
}
