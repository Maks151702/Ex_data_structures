package Ex_6_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        // Добавляем 10 пользователей в коллекцию
        users.add(new User(3, "John", "Doe", 30));
        users.add(new User(1, "Alice", "Johnson", 25));
        users.add(new User(5, "Bob", "Smith", 35));
        users.add(new User(2, "Eve", "Brown", 28));
        users.add(new User(4, "Charlie", "Wilson", 40));
        users.add(new User(7, "Grace", "Miller", 22));
        users.add(new User(6, "Daniel", "Clark", 33));
        users.add(new User(9, "Olivia", "White", 29));
        users.add(new User(8, "Sophia", "Davis", 32));
        users.add(new User(10, "Liam", "Martin", 27));

        System.out.println("Коллекция до сортировки:");
        for (User user : users) {
            System.out.println(user);
        }

        // Сортировка с использованием Comparable
        Collections.sort(users);

        System.out.println("\nКоллекция после сортировки с использованием Comparable:");
        for (User user : users) {
            System.out.println(user);
        }

        // Перемешиваем список
        Collections.shuffle(users);

        // Сортировка с использованием Comparator
        UserComparator userComparator = new UserComparator();
        Collections.sort(users, userComparator);

        System.out.println("\nКоллекция после сортировки с использованием Comparator:");
        for (User user : users) {
            System.out.println(user);
        }
}
}
