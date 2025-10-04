public class OrdenacaoIcones {

   
    static void mostrar(String[] v) {
        for (String nome : v) {
            System.out.print(nome + " | ");
        }
        System.out.println();
    }

  
    static void bubbleSort(String[] v) {
        int n = v.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (v[j].compareTo(v[j + 1]) > 0) {
                    String temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
    }


    static void insertionSort(String[] v) {
        for (int i = 1; i < v.length; i++) {
            String chave = v[i];
            int j = i - 1;
            while (j >= 0 && v[j].compareTo(chave) > 0) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = chave;
        }
    }

    
    static void selectionSort(String[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j].compareTo(v[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = v[i];
            v[i] = v[minIndex];
            v[minIndex] = temp;
        }
    }

    public static void main(String[] args) {

        
        String[] bubbleVet = {"Einstein", "Newton", "Tesla", "Galileu", "Darwin"};
        String[] insertionVet = {"Cleopatra", "Napoleao", "Alexandre", "Mandela", "Churchill"};
        String[] selectionVet = {"Socrates", "Platao", "Aristoteles", "Descartes", "Kant"};

        System.out.println("=== Bubble Sort ===");
        System.out.print("Antes: ");
        mostrar(bubbleVet);
        bubbleSort(bubbleVet);
        System.out.print("Depois: ");
        mostrar(bubbleVet);
        System.out.println();

        System.out.println("=== Insertion Sort ===");
        System.out.print("Antes: ");
        mostrar(insertionVet);
        insertionSort(insertionVet);
        System.out.print("Depois: ");
        mostrar(insertionVet);
        System.out.println();

        System.out.println("=== Selection Sort ===");
        System.out.print("Antes: ");
        mostrar(selectionVet);
        selectionSort(selectionVet);
        System.out.print("Depois: ");
        mostrar(selectionVet);
    }
}
