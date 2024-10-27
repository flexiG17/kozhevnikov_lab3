import java.util.Scanner;

/*
Дан массив A размера N. Сформировать новый массив B того же размера, элементы которого определяются следующим образом:
...
Реализовать в виде отдельного статического метода.
*/
public class ThirdTask {
    public static int[] createNewArray(int[] A) {
        int prevArrayLength = A.length;
        int[] newArray = new int[prevArrayLength];

        for (int k = 0; k < prevArrayLength; k++) {
            if (A[k] < 5) {
                newArray[k] = 2 * A[k];
            } else {
                newArray[k] = A[k] / 2;
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        while (true) {
            System.out.print("Введите размер массива N: ");
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                if (N > 0) {
                    break;
                } else {
                    System.out.println("Размер массива должен быть положительным числом!");
                }
            } else {
                System.out.println("Введите целое число!");
                scanner.next();
            }
        }

        int[] A = new int[N];
        System.out.print("Введите значения массива A: ");
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int[] B = createNewArray(A);
        System.out.println("Полученный массив B:");
        for (int value : B) {
            System.out.print(value + " ");
        }

        scanner.close();
    }
}
