package com.company;

import java.util.Scanner;

public class NotaDoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        if (nota >= 70) {
            System.out.print("Parabens voce foi aprovador!");
        }
        else {
            System.out.print("infelizmente voce foi reprovado");
        }
    }
}
