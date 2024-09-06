package br.com.alura;

import br.com.alura.model.Pessoa;
import br.com.alura.service.CalcularIMC;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu(scanner);
    }

    private static void menu(Scanner scanner) {
        while (true) {
            System.out.println("""
                    0 - Sair
                    1 - Calcular IMC
                    """);
            int action = 0;
            try {
                action = scanner.nextInt();
                scanner.nextLine();
            } catch (NumberFormatException ex) {
                System.err.println("Operação inválida! Escolha alguma alternativa");
            }
            switch (action) {
                case 0:
                    System.out.println("Saindo....");
                    break;
                case 1:
                    preencherCampos(scanner);
                    break;
            }
            if (action == 0) {
                break;
            }
        }
    }

    private static void preencherCampos(Scanner scanner) {
        Pessoa pessoa = new Pessoa();
        while (true) {
            try {
                System.out.print("Informe o seu nome: ");
                pessoa.setNome(scanner.nextLine());

                System.out.print("\nInforme o sua idade: ");
                pessoa.setIdade(scanner.nextInt());

                System.out.print("\nInforme o sua altura: ");
                pessoa.setAltura(scanner.nextDouble());

                System.out.print("\nInforme o seu peso: ");
                pessoa.setPeso(scanner.nextDouble());
                break;
            } catch (InputMismatchException e) {
                System.err.println("Entrada inválida! Por favor, insira um número.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.err.println("Erro: " + e.getMessage());
                scanner.nextLine();
            }
        }
        calcularImc(CalcularIMC.calcular(pessoa));
    }

    public static void calcularImc(double resultado) {
        if (resultado < 18.5) {
            System.out.printf("""
                                    
                    ------------------------
                    RESULTADO DO SEU IMC
                    
                    Seu IMC é: %.1f
                    Classificação: MAGREZA
                    ------------------------
                    
                    """, resultado);
        } else if (resultado < 24.9) {
            System.out.printf("""
                                    
                    ------------------------
                    RESULTADO DO SEU IMC
                    
                    Seu IMC é: %.1f
                    Classificação: NORMAL
                    ------------------------
                    
                    """, resultado);
        } else if (resultado < 29.9) {
            System.out.printf("""
                                    
                    ------------------------
                    RESULTADO DO SEU IMC
                    
                    Seu IMC é: %.1f
                    Classificação: SOBREPESO
                    ------------------------
                    
                    """, resultado);
        } else if (resultado < 39.9) {
            System.out.printf("""
                                    
                    ------------------------
                    RESULTADO DO SEU IMC
                    
                    Seu IMC é: %.1f
                    Classificação: OBESIDADE
                    ------------------------
                    
                    """, resultado);
        } else {
            System.out.printf("""
                                    
                    ------------------------
                    RESULTADO DO SEU IMC
                    
                    Seu IMC é: %.1f
                    Classificação: OBESIDADE GRAVE
                    ------------------------
                    
                    """, resultado);
        }
    }
}