package sem1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        exc3("NoExistFile");
        int[] ar = {1, 2, 3, 4, 5};
        int[] ray = {6, 7, 8, 9, 10};
        try {
            System.out.println(Arrays.toString(mergeArrays(ar, ray)));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    // ArithmeticException
    public static int exc1() {
        return 2 / 0;
    }

    // StackOverFlow
    public static int exc2(int pos) {
        return exc2(pos - 1) + exc2(pos - 2);
    }

    // FileNotFoundException || IOException
    public static boolean exc3(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            return true;
        } catch (IOException f) {
            f.printStackTrace();
        }
        return false;
    }

    public static int[] mergeArrays(int[] array1, int[] array2) throws RuntimeException {
        if (array1.length != array2.length) {
            throw new RuntimeException("Массивы разной длины");
        }
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] - array2[i];
        }
        return result;
    }


}
