import java.util.Scanner;

public class RastroDeNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = "-";
        }

        while (true) {
            System.out.println("\n1 - Adicionar nome");
            System.out.println("2 - Mostrar rastro");
            System.out.println("3 - Alterar nome para maiúsculo");
            System.out.println("4 - Remover último");
            System.out.println("0 - Sair");
            String op = sc.nextLine();

            if (op.equals("0")) break;

            if (op.equals("1")) {
                System.out.print("Nome: ");
                String n = sc.nextLine();
                for (int i = nomes.length - 1; i > 0; i--) {
                    nomes[i] = nomes[i - 1];
                }
                nomes[0] = n;
            }

            if (op.equals("2")) {
                for (int i = 0; i < nomes.length; i++) {
                    System.out.println(i + " - " + nomes[i]);
                }
            }

            if (op.equals("3")) {
                System.out.print("Buscar: ");
                String alvo = sc.nextLine();
                for (int i = 0; i < nomes.length; i++) {
                    if (nomes[i].equalsIgnoreCase(alvo)) {
                        nomes[i] = nomes[i].toUpperCase();
                    }
                }
            }

            if (op.equals("4")) {
                nomes[nomes.length - 1] = "-";
            }
        }
        sc.close();
    }
}