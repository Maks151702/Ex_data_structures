package Ex_2;

import java.util.*;

//9.1 array
//9.2 linkedlist
//9.3. set
public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add( "ВН4552ТТ");
        list.add( "ВН3152НТ");
        list.add( "ВН4502ОТ");

        String command;
        String number;
        int index=0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть гос. номер: ");
            number = scanner.next();
            System.out.println("Введіть номер у списку: ");
            index = scanner.nextInt();

           if(index>list.size()){
               list.add(number);
           }else{
               list.add(index,number);
           }

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
