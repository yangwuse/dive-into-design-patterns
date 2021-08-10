package creational.singleton.bookcode.threadunsafe;

public class SingleTread {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance("Bar");
        Singleton s2 = Singleton.getInstance("Foo");
        System.out.println(s1 == s2); // true
    }
}
