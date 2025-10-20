import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        One one = new One();

        int choice; // хранение номеров задач
        do {
            System.out.println("\nНомера задач:");
            System.out.println("\n 11 - 3,5,7,9 ");
            System.out.println(" 21 - 3,5,7,9 ");
            System.out.println(" 31 - 3,5,7,9 ");
            System.out.println(" 41 - 3,5,7,9 ");

            System.out.println("  0 - Выход");
            System.out.print("\nВыберите задачу: ");

            choice = scanner.nextInt(); // ожидание ввода

            switch (choice) {
                case 0:
                    System.out.println("Выход из программы.");
                    break;

                case 11: // 1.1 Дробная часть
                    System.out.println("Задание 1.1: Дробная часть");
                    System.out.print("Введите вещественное число через запятую: ");
                    double x = scanner.nextDouble();
                    String formatted = String.format("%.2f", one.fraction(x));
                    System.out.println("Дробная часть = " + formatted);
                    break;

                case 13: // 1.3 Символ в число
                    System.out.println("Задание 1.3: Символ - Число");
                    System.out.print("Введите символ: ");
                    char chars = scanner.next().charAt(0);
                    System.out.println("Преобразованный символ: " + one.charToNum(chars));
                    break;

                case 15: // 1.5 Двузначное
                    System.out.println("Задание 1.5: Двузначное");
                    System.out.print("Введите целое число: ");
                    int num1 = scanner.nextInt();
                    System.out.println("Результат: " + one.is2Digits(num1));
                    break;

                case 17: // 1.7 Диапазон
                    System.out.println("Задание 1.7: Диапазон");
                    System.out.print("Введите левую границу: ");
                    int a = scanner.nextInt();
                    System.out.print("Введите правую границу: ");
                    int b = scanner.nextInt();
                    System.out.print("Введите число для проверки: ");
                    int num = scanner.nextInt();
                    System.out.println("В диапазоне: " + one.isInRange(a, b, num));
                    break;

                case 19: // 1.9 Равенство
                    System.out.println("Задание 1.9: Равенство");
                    System.out.print("Введите первое число: ");
                    int n1 = scanner.nextInt();
                    System.out.print("Введите второе число: ");
                    int n2 = scanner.nextInt();
                    System.out.print("Введите третье число: ");
                    int n3 = scanner.nextInt();
                    System.out.println("Все равны: " + one.isEqual(n1, n2, n3));
                    break;

                case 21: // 2.1 Модуль числа
                    System.out.println("Задание 2.1: Модуль числа");
                    System.out.print("Введите целое число: ");
                    int num2 = scanner.nextInt();
                    System.out.println("Модуль числа: " + one.abs(num2));
                    break;

                case 23: // 2.3 Тридцать пять
                    System.out.println("Задание 2.3: Тридцать пять");
                    System.out.print("Введите целое число: ");
                    int num3 = scanner.nextInt();
                    System.out.println("Результат: " + one.is35(num3));
                    break;

                case 25: // 2.5 Тройной максимум
                    System.out.println("Задание 2.5: Тройной максимум");
                    System.out.print("Введите первое число: ");
                    int k = scanner.nextInt();
                    System.out.print("Введите второе число: ");
                    int l = scanner.nextInt();
                    System.out.print("Введите третье число: ");
                    int m = scanner.nextInt();
                    System.out.println("Максимальное: " + one.max3(k, l, m));
                    break;

                case 27: // 2.7 Двойная сумма
                    System.out.println("Задание 2.7: Двойная сумма");
                    System.out.print("Введите первое число: ");
                    int z = scanner.nextInt();
                    System.out.print("Введите второе число: ");
                    int y = scanner.nextInt();
                    System.out.println("Результат: " + one.sum2(z, y));
                    break;

                case 29: // 2.9 День недели
                    System.out.println("Задание 2.9: День недели");
                    System.out.print("Введите номер дня (1-7): ");
                    int dayNum = scanner.nextInt();
                    System.out.println("Результат: " + one.day(dayNum));
                    break;

                case 31: // 3.1 Числа подряд
                    System.out.println("Задание 3.1: Числа подряд");
                    System.out.print("Введите число: ");
                    int num5 = scanner.nextInt();
                    System.out.println("Результат: " + one.listNums(num5));
                    break;

                case 33: // 3.3 Четные числа
                    System.out.println("Задание 3.3: Четные числа");
                    System.out.print("Введите число: ");
                    int num6 = scanner.nextInt();
                    System.out.println("Результат: " + one.chet(num6));
                    break;

                case 35: // 3.5 Длина числа
                    System.out.println("Задание 3.5: Длина числа");
                    System.out.print("Введите число: ");
                    long num7 = scanner.nextLong();
                    System.out.println("Длина числа: " + one.numLen(num7));
                    break;

                case 37: // 3.7 Квадрат
                    System.out.println("Задание 3.7: Квадрат");
                    System.out.print("Введите размер: ");
                    int size7 = scanner.nextInt();
                    one.square(size7);
                    break;

                case 39: // 3.9 Правый треугольник
                    System.out.println("Задание 3.9: Правый треугольник");
                    System.out.print("Введите высоту: ");
                    int x1 = scanner.nextInt();
                    one.rightTriangle(x1);
                    break;

                case 41: // 4.1 Поиск первого вхождения
                    System.out.println("Задание 4.1: Поиск первого вхождения");
                    int[] arr = inputArray(scanner);
                    System.out.print("Введите число для поиска: ");
                    int searchNum = scanner.nextInt();
                    System.out.println("Результат: " + one.findFirst(arr, searchNum));
                    break;

                case 43: // 4.3 Максимальный по модулю
                    System.out.println("Задание 4.3: Максимальный по модулю");
                    int[] arr43 = inputArray(scanner);
                    System.out.println("Результат: " + one.maxAbs(arr43));
                    break;

                case 45: // 4.5 Вставка массива в массив
                    System.out.println("Задание 4.5: Вставка массива в массив");
                    System.out.println("Введите исходный массив:");
                    int[] arr45 = inputArray(scanner);
                    System.out.println("Введите массив для вставки:");
                    int[] ins = inputArray(scanner);
                    System.out.print("Введите позицию для вставки: ");
                    int pos = scanner.nextInt();
                    System.out.println("Результат: " + Arrays.toString(one.add(arr45, ins, pos)));
                    break;

                case 47: // 4.7 Возвратный реверс
                    System.out.println("Задание 4.7: Возвратный реверс");
                    int[] arr47 = inputArray(scanner);
                    System.out.println("Результат: " + Arrays.toString(one.reverseBack(arr47)));
                    break;

                case 49: // 4.9 Все вхождения
                    System.out.println("Задание 4.9: Все вхождения");
                    int[] arr49 = inputArray(scanner);
                    System.out.print("Введите число для поиска: ");
                    int searchNum49 = scanner.nextInt();
                    System.out.println("Результат: " + Arrays.toString(one.findAll(arr49, searchNum49)));
                    break;

                default:
                    System.out.println("Неверный выбор! Попробуйте снова.");
            }

            if (choice != 0) {
                System.out.println("\nНажмите Enter для продолжения...");
                scanner.nextLine(); // забирает \n (очистка)
                scanner.nextLine(); // ждёт нажатия enter (пауза)
            }

        } while (choice != 0);

        scanner.close();
    }

    private static int[] inputArray(Scanner scanner) {
        System.out.print("Введите элементы массива через пробел: ");
        scanner.nextLine(); // Очистка буфера
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        return arr;
    }
}