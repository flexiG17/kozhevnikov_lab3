import java.util.Scanner;

/*
2. Дан целочисленный массив размера N. Найти максимальное количество его одинаковых элементов.
*/
public class SecondTask {
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

        int maxCount = 0;
        int maxValue = 0;

        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = i + 1; j < N; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = array[i];
            }
        }

        System.out.println("Чаще всего повторялось значение: " + maxValue);
        System.out.println("Количество его повторение: " + maxCount);
    }
}
