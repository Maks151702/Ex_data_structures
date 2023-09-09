package Ex_7_teor;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<?> list = new ArrayList<>();

        printList(list);
        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(34);
        System.out.println("Value: " + integerBox.getValue());
    }
}

class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
