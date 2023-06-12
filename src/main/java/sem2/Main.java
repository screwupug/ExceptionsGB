package sem2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        while (true) {
//            if (askForFloat()) {
//                break;
//            }
//        }
//        exc2();
        emptyString();
    }


    public static boolean askForFloat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        String input = scanner.nextLine();
        if (tryToParseFloat(input)) {
            System.out.println(input);
            return true;
        } else {
            System.out.println("Введено нечисловое значение");
            return false;
        }
    }

    private static boolean tryToParseFloat(String input) {
        try {
            Float.parseFloat(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void exc2() {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            int d = 0;
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }


    public static void exc3(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Ошибка пр делении чисел");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static void emptyString() throws RuntimeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String input = scanner.nextLine();
        if (input.trim().length() == 0 ) {
            throw new RuntimeException("Пустые строки вводить нельзя!");
        }
    }



}
