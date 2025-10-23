package treinamento7;
import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(101);
        }

        System.out.println("Antes: " + Arrays.toString(numeros));

        for (int i = 1; i < numeros.length; i++) {
            int chave = numeros[i];
            int j = i - 1;

            while (j >= 0 && numeros[j] > chave) {
                numeros[j + 1] = numeros[j];
                j--;
            }
            numeros[j + 1] = chave;
        }

        System.out.println("Depois: " + Arrays.toString(numeros));
    }
}
