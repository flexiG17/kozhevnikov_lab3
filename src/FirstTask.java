import java.util.Scanner;

/*
22. Кожевников Арсений
Вариант 2
Дан целочисленный массив размера N. Вывести вначале все содержащиеся в данном массиве четные числа в порядке возрастания их индексов,
а затем — все нечетные числа в порядке убывания их индексов.
 */
public class FirstTask {
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

        int[] array = new int[N];

        System.out.printf("Введите элементы массива (всего %d значений): ", N);
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Четные числа в порядке возрастания их индексов: ");
        for (int i = 0; i < N; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Нечетные числа в порядке убывания их индексов: ");
        for (int i = N - 1; i >= 0; i--) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
