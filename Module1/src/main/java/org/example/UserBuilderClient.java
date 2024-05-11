package org.example;

public class UserBuilderClient {
    public static void main(String[] args) {
        User user = new User.UserBuilder("98473", "Mila", "Iva")
                .address("Vileika")
                .phone("+375256768890")
                .build();
        System.out.println(user);
    }
}
