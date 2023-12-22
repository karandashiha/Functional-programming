package app.task1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Task1_Consumer {
    public static void main(String[] args) {

        Consumer<String> consumer = str ->
                System.out.println("Name is " + str);

        List<String> list = Arrays.asList("Tom","Alice","Bob","Lucy");

        for (String str : list) {
            consumer.accept(str);
        }
    }
}
