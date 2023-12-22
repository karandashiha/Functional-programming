package app.task2;

import java.util.function.Supplier;

public class Main {
    static String name;
    static String phone;

    public static void main(String[] args) {

        name = "Tom";
        phone = "555 123-8596";

        User user = getUser(User::new);
        user.setName(name);
        user.setPhone(phone);
        System.out.println("User name is " + user.getName() +
                ", phone " + user.getPhone());
    }

    public static User getUser(Supplier<User> supplier) {
        return supplier.get();
    }
}
