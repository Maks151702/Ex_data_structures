package Ex_7_practice;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[]number = new int[10];
        Random random = new Random(100);

        // Заполнение коллекций случайными числами
        for (int i = 0; i < number.length; i++) {
            int randomNumber = random.nextInt(100)+1;
            number[i] = randomNumber;
        }
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        Sort sort = new Sort();
        long startTime = System.nanoTime();

        sort.selectionSort(number);
        System.out.println("После сортировки выбором:");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Время сортировки:" + duration);

        //Сбрасываем сортировку для наглядности
        System.out.println("Пересоздание массива:");
        for (int i = 0; i < number.length; i++) {
            int randomNumber = random.nextInt(100)+1;
            number[i] = randomNumber;
        }

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        startTime = System.nanoTime();
        sort.bubbleSort(number);

        System.out.println("После сортировки пузырьком:");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Время сортировки:" + duration);

        //Сбрасываем сортировку для наглядности
        System.out.println("Пересоздание массива:");
        for (int i = 0; i < number.length; i++) {
            int randomNumber = random.nextInt(100)+1;
            number[i] = randomNumber;
        }

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        startTime = System.nanoTime();
        sort.insertionSort(number);
        System.out.println("После сортировки вставками:");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Время сортировки:" + duration);

        System.out.println("Пересоздание массива:");
        for (int i = 0; i < number.length; i++) {
            int randomNumber = random.nextInt(100)+1;
            number[i] = randomNumber;
        }

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        startTime = System.nanoTime();
        sort.shellSort(number);
        System.out.println("После сортировки Шелла:");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Время сортировки:" + duration);

        System.out.println("Пересоздание массива:");
        for (int i = 0; i < number.length; i++) {
            int randomNumber = random.nextInt(100)+1;
            number[i] = randomNumber;
        }

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        startTime = System.nanoTime();
        sort.quickSort(number, 0, number.length-1);
        System.out.println("После быстрой сортировки:");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Время сортировки:" + duration);
    }
}
