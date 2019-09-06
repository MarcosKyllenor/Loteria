package testes;

import regras.Caixa;
import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        Caixa caixa = new Caixa();
        Scanner teclado = new Scanner(System.in);
        System.out.println("quanto deseja depositar? ");
        float valorDeposito = teclado.nextFloat();
        caixa.depositar(valorDeposito);
        System.out.println("quanto deseja sacar?");
        float valorSaque = teclado.nextFloat();
        caixa.sacar(valorSaque);
        System.out.println("saldo " + caixa.qtdDinheiro + " R$");

    }
}