package com.company;

import java.util.Scanner;

public class ValorDoProdutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do peuduto: ");
        double precoDoProduto = scanner.nextDouble();
        int cem = 100;
        System.out.println("Digite o seu tipo de pagamento [1 para pagamneto a vista] / [2para pagamneto a prazo] ");
        Integer TipodePagamento = scanner.nextInt();

        boolean pagamentoAVista = TipodePagamento.equals(1);
        double juros = 0.0;
        if (!pagamentoAVista) ;{
        juros = 10.0;
    }
        double acrescimo = precoDoProduto * juros;
        double resultadoDoAcrescimo = acrescimo / cem;
        double precoAPagar = resultadoDoAcrescimo + precoDoProduto;
        System.out.println("o pereco que  voce vai pagar e: " + precoAPagar);

    }
}

