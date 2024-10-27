import java.util.InputMismatchException;
import java.util.Scanner;

public class FifthTask {
    // формула подсчета центростремительного ускорения
    // a = v^2 / R
    private static void PrintProgramDescription() {
        System.out.println("Данная программа поможет вам посчитать значение центростремительного ускорения с точностью до тысячных");
    }

    private static void PrintProgrammerDescription() {
        System.out.println("Кожевников Арсений\nСтудент магистратуры ИРИТ-РТФ\nАкадем группа: РИМ-140970");
    }

    private static String CalculateCentripetalAcceleration() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder results = new StringBuilder();

        System.out.print("Сколько расчетов вы хотите выполнить? ");
        int count = scanner.nextInt();

        double[] speeds = new double[count];
        double[] radii = new double[count];

        for (int i = 0; i < count; i++) {
            try {
                System.out.print("Скорость V(м/с) для " + (i + 1) + " расчета: ");
                speeds[i] = scanner.nextDouble();

                System.out.print("Радиус кривизны окружности R(м) для " + (i + 1) + " расчета: ");
                radii[i] = scanner.nextDouble();
            } catch (Exception e) {
                throw new InputMismatchException("Введённые значения не могут быть строкой!");
            }
        }

        results.append("Результаты расчетов центростремительного ускорения:\n");
        for (int i = 0; i < speeds.length; i++) {
            double acceleration = Math.pow(speeds[i], 2) / radii[i];
            String accelerationText = String.format("%.3f", acceleration);
            results.append("a для ").append(i + 1).append(" расчета = ").append(accelerationText).append(" м/с^2\n");
        }

        return results.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет юный физик или просто преподаватель, проверяющий дз!");

        String programText = """
                
                Введите 1, чтобы выполнить расчет
                Введите 2, чтобы получить информацию о программе
                Введите 3, чтобы получить информацию о разработчике
                Введите 4, чтобы выйти из программы.
                """;
        System.out.println(programText);
        int programCode;

        while (true) {
            System.out.print("Для продолжения введите цифру от 1 до 4: ");
            programCode = scanner.nextInt();
            if (programCode < 1 || programCode > 4) {
                System.out.println("Введённое значение не может быть меньше 1 и больше 4!");
                continue;
            }
            switch (programCode) {
                case 1: {
                    System.out.print("Вы выбрали раздел для проведения расчётов\n");
                    String resultText = CalculateCentripetalAcceleration();
                    System.out.print(resultText);
                }
                break;
                case 2: {
                    PrintProgramDescription();
                }
                break;
                case 3: {
                    PrintProgrammerDescription();
                }
                break;
                case 4: {
                    System.out.println("До свидания!");
                    return;
                }
            }
            System.out.println(programText);
        }
    }
}
