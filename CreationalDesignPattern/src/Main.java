package CreationalDesignPattern.src;

import CreationalDesignPattern.src.DataAccessLayer.UserDatabase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        UserDatabase userDatabase = UserDatabase.getInstance();
        UserDatabase userDatabase1 = UserDatabase.getInstance();

        System.out.println(userDatabase);
        System.out.println(userDatabase1);

    }
}
