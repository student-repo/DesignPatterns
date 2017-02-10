package Singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Singleton s1 = Singleton.getInstance();
        s1.name = "stefan";

        Singleton s2 = Singleton.getInstance();
        s2.name = "mariusz";

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
