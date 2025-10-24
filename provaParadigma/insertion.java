package provaParadigma;

import java.util.Arrays;
import java.util.Random;

public class insertion {
    public static void main(String[] args) {
        int[] num = new int[100];
        Random random = new Random();


        System.out.println("Gerando os numero em modo aleatorio");
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(101);
        }

        System.out.println("Antes: " + Arrays.toString(num));

       
        for (int i = 1; i < num.length; i++) {
            int agora = num[i];
            int j = i - 1;

            while (j >= 0 && num[j] < agora) {
                num[j + 1] = num[j];
                j--;
            }
            num[j + 1] = agora;
        }

        System.out.println("\nDepois:");
        System.out.println(Arrays.toString(num));

      
    }
}