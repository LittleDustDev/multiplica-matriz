import java.util.Scanner;

public class MultiplicaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Informar o tamanho das matrizes
        System.out.println("Informe o número de linhas da matriz A:");
        int linhasA = scanner.nextInt();
        System.out.println("Informe o número de colunas da matriz A:");
        int colunasA = scanner.nextInt();

        System.out.println("Informe o número de linhas da matriz B:");
        int linhasB = scanner.nextInt();
        System.out.println("Informe o número de colunas da matriz B:");
        int colunasB = scanner.nextInt();

        // Verifica se a multiplicação das matrizes é possível e pede para informar os elementos
        if (colunasA != linhasB) {
            System.out.println("A multiplicação das matrizes é impossível. O número de colunas de A deve ser igual ao número de linhas de B.");
            return;
        }

        int[][] matrizA = new int[linhasA][colunasA];
        int[][] matrizB = new int[linhasB][colunasB];

        System.out.println("Informe os elementos da matriz A:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Informe os elementos da matriz B:");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Efetua o cálculo da multiplicação das matrizes
        int[][] matrizC = new int[linhasA][colunasB];
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // Apresenta as matrizes e seus conteúdos
        System.out.println("Matriz A:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz B:");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz C (Resultado):");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
