import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1: Создание массивов
        System.out.println("Задача 1");
        //Массив 1
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        //Массив 2
        double[] partNumbers = {1.57, 7.654, 9.986};
        //Массив 3
        long[] numbersLong = {1_000_000, 245_570, 790_000, 80, 167_000_000, 45_120, 7_001};
        //Задача 2: Вывести полученное в консоль
        System.out.println("Задача 2");
        //Первый
        for (int index = 0; index < numbers.length; index++) {
            if (index == numbers.length - 1) {
                System.out.println(numbers[index]);
                break;
            }
            System.out.print(numbers[index] + ", ");
        }
        //Второй
        for (int index = 0; index < partNumbers.length; index++) {
            if (index == partNumbers.length - 1) {
                System.out.println(partNumbers[index]);
                break;
            }
            System.out.print(partNumbers[index] + ", ");
        }
        //Третий
        for (int index = 0; index < numbersLong.length; index++) {
            if (index == numbersLong.length - 1) {
                System.out.println(numbersLong[index]);
                break;
            }
            System.out.print(numbersLong[index] + ", ");
        }
        //Задача 3: Вывести результаты массивов в обратном порядке
        System.out.println("Задача 3");
        //Первый массив
        for (int index = numbers.length - 1; index >= 0; index--) {
            System.out.print(numbers[index]);
            if (index > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //Второй массив
        for (int index = partNumbers.length - 1; index >= 0; index--) {
            System.out.print(partNumbers[index]);
            if (index > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //третий массив
        for (int index = numbersLong.length - 1; index >= 0; index--) {
            System.out.print(numbersLong[index]);
            if (index > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //Задача 4: Сделать чётные числа из нечётных в первом массиве
        System.out.println("Задача 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = numbers[i] + 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

}