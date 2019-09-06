package loteria;

import java.util.Random;
import java.util.Scanner;

public class Loteria {

// pedindo os numeros ao usuario
    public static void main(String[] args) {
        int[] valores = new int[6];
        Scanner in = new Scanner(System.in);
        System.out.println("Digite 6 numeros");
        for (int i = 0; i < 6; i++) {
            int num = -1;
            while (num == -1) {
                num = capNum(in, i);
                for (int j = 0; j < i; j++) {
                    if (valores[j] == num) {
                        num = -1;
                    }
                }

            }
            valores[i] = num;

        } // sorteio de numeros
        imprimeVetor(valores);
        Random r = new Random();
        int[] bolas = new int[6];
        for (int i = 0; i < 6; i++) {
            int bola = -1;
            do {
                bola = (r.nextInt(60) + 1);
                for (int j = 0; j < i; j++) {
                    if (bolas[j] == bola) {
                        bola = -1;
                        System.out.println("Repitido");
                        break;
                    }
                }

            } while (bola == -1);
            bolas[i] = bola;
        }
        imprimeVetor(bolas);
        int acertos = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (bolas[j] == valores[i]) {
                    acertos++;
                    System.out.println("acertou o numero: " + bolas[j]);
                    break;
                }

            }

        }
        System.out.println("Numero de acertos: " + acertos);

    } // comparar os resultados    

    public static int capNum(Scanner in, int i) {
        //System.out.println("Diginte o " + (i + 1) + "º numero");
        int num = in.nextInt();
        if (num >= 1 && num <= 60) {
            return num;
        } else {
            return -1;
        }

    }

    public static void imprimeVetor(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println("");
    }
}
