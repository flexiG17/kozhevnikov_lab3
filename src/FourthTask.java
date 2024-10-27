import java.util.Scanner;

/*
Даны целые положительные числа M и N. Сформировать целочисленную матрицу размера M × N, у которой все элементы J-го столбца имеют значение 5J (J = 1, …, N).
*/
public class FourthTask {
    private static int getArraySizeWithCheck(String text) {
        int result;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(text);
            if (scanner.hasNextInt()) {
                result = scanner.nextInt();
                if (result > 0) {
                    break;
                } else {
                    System.out.println("Значение должно быть положительным числом!");
                }
            } else {
                System.out.println("Введите целое число!");
                scanner.next();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = getArraySizeWithCheck("Введите количество строк M: ");
        int N = getArraySizeWithCheck("Введите количество столбцов N: ");

        int[][] matrix = new int[M][N];

        for (int j = 0; j < N; j++) {
            int columnValue = 5 * (j + 1);
            for (int i = 0; i < M; i++) {
                matrix[i][j] = columnValue;
            }
        }

        System.out.println("Сформированная матрица:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
