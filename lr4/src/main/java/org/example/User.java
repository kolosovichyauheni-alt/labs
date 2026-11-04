package org.example;

public class User {
    private String username;
    private Role role;

    public User(String username, Role role) {
        this.username = username;
        this.role = role;
    }

    public String getUsername() { return username; }
    public Role getRole()       { return role; }




    public static void main(String[] args) {
        User[] users = {
                new User("ivan",   Role.ADMIN),
                new User("petr",   Role.USER),
                new User("anna",   Role.ADMIN),
                new User("olga",   Role.GUEST),
                new User("sergey", Role.USER)
        };

        System.out.println("Администраторы:");
        for (User u : users) {
            if (u.role == Role.ADMIN) {
                System.out.println(u.username);
            }
        }
    }
}