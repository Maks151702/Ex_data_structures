package Ex_1;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add( "ВН4552ТТ");
        list.add( "ВН3152НТ");
        list.add( "ВН4502ОТ");

        String command;
        String number;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть гос. номер: ");
            number = scanner.next();

            list.add(number);
            System.out.println("Номер додан. ");

            System.out.println("Введіть команду");
            command = scanner.next();

            if(command.equals("СПИСОК")){
                System.out.println(list);
            }
        }
        while (!command.equals("СТОП"));
        System.out.println("Выход из системы");
    }
}
