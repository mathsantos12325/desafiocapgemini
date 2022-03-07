import java.util.Arrays;

public class QuestoesCapgemini {

    // Encontrar Mediana
    public static int ObterMediana(int[] array) {
        int tamarray = array.length - 1;
        if(tamarray % 2 == 0) {
            System.out.println("Lista com posição par");
        } else {
            Arrays.sort(array);


        }
        return array[(tamarray / 2)];

    }

    // Encontrar pares
    public static int AgruparPares(int[] lista, int x) {
        Arrays.sort(lista);
        int tamlista = lista.length - 1;

        int count = 0;

        for (int j = tamlista; j >= 0; j--) {
            for (int i = tamlista; i >= 0; i--) {
                if ((lista[j] - lista[i]) == x) {
                    count++;
                }
            }
        }

        return count;
    }

    // Questão 3
    public static String EncriptarTexto(String frase) {
        String frasesemaspas = frase.replaceAll("\\s+", "");
        double tamtxt = frasesemaspas.length();

        int raiz = (int) Math.ceil(Math.sqrt(tamtxt));

        char matriz[][] = new char[raiz][raiz];

        int indexCount = 0;
        StringBuilder textoEncriptado = new StringBuilder();

        for (var row = 0; row < raiz; row++) {
            for (var column = 0; column < raiz; column++) {

                if (indexCount > tamtxt - 1)
                    break;

                matriz[row][column] = frasesemaspas.charAt(indexCount);
                indexCount++;
            }
        }

        for (var column = 0; column < raiz; column++) {
            for (var row = 0; row < raiz; row++) {

                if(!(matriz[row][column] == 0)){
                    textoEncriptado.append(matriz[row][column]);
                }

                if (row == (raiz - 1)) {
                    textoEncriptado.append(" ");
                }

            }
        }

        return textoEncriptado.toString().trim();
    }

}