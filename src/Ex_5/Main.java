package Ex_5;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 1000000;
        List<Integer> arrayList = new ArrayList<>(size);
        List<Integer> linkedList = new LinkedList<>();

        Random random = new Random();

        // Заполнение коллекций случайными числами
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(size);
            arrayList.add(randomNumber);
            linkedList.add(randomNumber);
        }

        // Измерение времени добавления в конец списка
        long startTime = System.nanoTime();
        arrayList.add(999);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("ArrayList: Время добавления в конец списка: " + duration + " наносекунд");

        startTime = System.nanoTime();
        linkedList.add(999);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList: Время добавления в конец списка: " + duration + " наносекунд");

        // Измерение времени добавления в первую половину списка
        startTime = System.nanoTime();
        arrayList.add(size / 2, 999);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList: Время добавления в первую половину списка: " + duration + " наносекунд");

        startTime = System.nanoTime();
        LinkedList<Integer> linkedListClone = new LinkedList<>(linkedList);
        linkedListClone.add(size / 2, 999);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList: Время добавления в первую половину списка: " + duration + " наносекунд");

        // Измерение времени получения элемента из конца списка
        startTime = System.nanoTime();
        int lastElementArrayList = arrayList.get(arrayList.size() - 1);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList: Время получения элемента из конца списка: " + duration + " наносекунд");

        startTime = System.nanoTime();
        int lastElementLinkedList = linkedList.get(linkedList.size() - 1);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList: Время получения элемента из конца списка: " + duration + " наносекунд");

        // Измерение времени получения элемента из первой половины списка
        startTime = System.nanoTime();
        int middleElementArrayList = arrayList.get(arrayList.size() / 4);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList: Время получения элемента из первой половины списка: " + duration + " наносекунд");

        startTime = System.nanoTime();
        int middleElementLinkedList = linkedList.get(linkedList.size() / 4);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList: Время получения элемента из первой половины списка: " + duration + " наносекунд");

        // Измерение времени удаления элемента из конца списка
        startTime = System.nanoTime();
        arrayList.remove(arrayList.size() - 1);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList: Время удаления элемента из конца списка: " + duration + " наносекунд");

        startTime = System.nanoTime();
        linkedList.remove(linkedList.size() - 1);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList: Время удаления элемента из конца списка: " + duration + " наносекунд");

        // Измерение времени удаления элемента из первой половины списка
        startTime = System.nanoTime();
        arrayList.remove(arrayList.size() / 4);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList: Время удаления элемента из первой половины списка: " + duration + " наносекунд");

        startTime = System.nanoTime();
        LinkedList<Integer> linkedListClone2 = new LinkedList<>(linkedList);
        linkedListClone2.remove(linkedListClone2.size() / 4);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList: Время удаления элемента из первой половины списка: " + duration + " наносекунд");
    }
}
