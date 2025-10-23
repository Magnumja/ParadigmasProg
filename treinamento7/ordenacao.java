package treinamento7;

import java.util.Arrays;
import java.util.Random;

public class ordenacao {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        Random random = new Random();

        // Geração de 100 números inteiros aleatórios entre 0 e 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(101); // Gera de 0 até 100
        }

        System.out.println("Antes da ordenação:");
        System.out.println(Arrays.toString(numeros));

        // Algoritmo Selection Sort
        for (int i = 0; i < numeros.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[menor]) menor = j;
            }
            int temp = numeros[i];
            numeros[i] = numeros[menor];
            numeros[menor] = temp;
        }

        System.out.println("\nDepois da ordenação:");
        System.out.println(Arrays.toString(numeros));
    }
}
