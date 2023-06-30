import java.util.Scanner;

public class homw1 {
// Задача 1 (треугольно число и факториал) 
    // public static int triangularNumber(int n) {
    //     return n * (n + 1) / 2;
    // }

    // public static int factorial(int n) {
    //     int result = 1;
    //     for (int i = 1; i <= n; i++) {
    //         result *= i;
    //     }
    //     return result;
    // }

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("Введите число:");
    //     int num = scanner.nextInt();

    //     System.out.println("Треугольное число: " + triangularNumber(num));
    //     System.out.println("Факториал: " + factorial(num));
    // }
// Задача 2. (Вывести все простые числа до 1000)
    // public static boolean isPrime(int num) {
    //         if (num <= 1) return false;
    //         for (int i = 2; i * i <= num; i++) {
    //             if (num % i == 0) return false;
    //         }
    //         return true;
    //     }

    //     public static void printPrimes(int n) {
    //         StringBuilder sb = new StringBuilder();
    //         for (int i = 2; i <= n; i++) {
    //             if (isPrime(i)) {
    //                 sb.append(i).append(", ");
    //             }
    //         }
    //         if (sb.length() > 0) {
    //             sb.setLength(sb.length() - 2); // удаляем пробел и запятую в конце строки
    //         }
    //         System.out.println(sb.toString());
    //     }

    //     public static void main(String[] args) {
    //         printPrimes(1000);
    //     }
// ЗАДАЧА 3 ( КАЛЬКУЛЛЯТОР)
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("Введите два числа:");
    //     double num1 = scanner.nextDouble();
    //     double num2 = scanner.nextDouble();

    //     System.out.println("Введите оператор (+, -, *, /):");
    //     char operator = scanner.next().charAt(0);

    //     scanner.close();
    //     double output;

    //     switch(operator)
    //     {
    //         case '+':
    //             output = num1 + num2;
    //             break;

    //         case '-':
    //             output = num1 - num2;
    //             break;

    //         case '*':
    //             output = num1 * num2;
    //             break;

    //         case '/':
    //             if (num2 != 0) {
    //                 output = num1 / num2;
    //             } else {
    //                 System.out.printf("Ошибка! Деление на ноль недопустимо.");
    //                 return;
    //             }
    //             break;

    //         default:
    //             System.out.printf("Ошибка! Неверный оператор. Пожалуйста, введите корректный оператор.");
    //             return;
    //     }

    //     System.out.println(num1+" "+operator+" "+num2+" = "+output);
    // }
// Задача 4 (доп формула)
    public static void solveEquation(String equation) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                String candidate = equation.replace('?', (char) ('0' + i));
                candidate = candidate.replace('?', (char) ('0' + j));
                String[] parts = candidate.split(" = ");
                String[] addends = parts[0].split(" \\+ ");
                int sum = Integer.parseInt(parts[1]);
                if (Integer.parseInt(addends[0]) + Integer.parseInt(addends[1]) == sum) {
                    System.out.println(candidate);
                    return;
                }
            }
        }
        System.out.println("Решение не найдено.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уравнение и разделите знаки пробелами:");
        String equation = scanner.nextLine();
        solveEquation(equation);
    }
}

