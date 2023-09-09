package data_structure;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,String> list = new HashMap();
        list.put("ВН4552ТТ","Mark Twein");
        list.put("ВН3152НТ","Ostin Bigger");
        list.put("ВН4502ОТ","Maike Dodge");

        String command;
        String number;
        String carOwner;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите гос. номер: ");
            number = scanner.next();
            System.out.println("Введите имя владельца: ");
            carOwner = scanner.next();

            if(list.containsKey(number)){
                System.out.println("Автомобиль с таким номер уже есть в списке");
                System.out.println("Обновляем владельца");
                list.put(number,carOwner);
            }else{
                list.put(number,carOwner);
            }

            System.out.println("Введите команду");
            command = scanner.next();

            if(command.equals("СПИСОК")){
                for (Map.Entry<String, String> entry : list.entrySet()) {
                    number = entry.getKey();
                    carOwner = entry.getValue();
                    System.out.println("Автомобиль с номером " + number + " принадлежит " + carOwner);
                }
            }else if(command.equals("АВТОМОБИЛИ")) {
                for (Map.Entry<String,String> entry : list.entrySet()) {
                    number = entry.getKey();
                    System.out.println("Автомобиль с номером " + number);
                }
            }else if(command.equals("Владельцы")) {
                for (Map.Entry<String,String> entry : list.entrySet()) {
                    carOwner = entry.getKey();
                    System.out.println("Владелец: " + carOwner);
                }
            }
        }
        while (!command.equals("СТОП"));
        System.out.println("Выход из системы");
    }
}
