package org.example;

public class Task3 {
    public static void main(String[] args) {
        User[] users = new User[5];
        users[0] = new User("admin1", Role.ADMIN);
        users[1] = new User("user1", Role.USER);
        users[2] = new User("guest1", Role.GUEST);
        users[3] = new User("admin2", Role.ADMIN);
        users[4] = new User("user2", Role.USER);

        System.out.println("Администраторы:");
        for (User u : users) {
            if (u.role == Role.ADMIN) {
                System.out.println(u.username);
            }
        }
    }
}
