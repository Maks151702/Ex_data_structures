package Ex_6_teor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[]args){
        List<String> mutableList = new ArrayList<>();
        mutableList.add("One");
        mutableList.add("Two");
        mutableList.add("Three");

        List<String> immutableList = Collections.unmodifiableList(mutableList);

        //immutableList.add("Four");

        for (String item : immutableList) {
            System.out.println(item);
        }
    }
}
