package creational.singleton.bookcode.threadunsafe;

public final class Singleton {
    public String name;
    private static Singleton single;
    private Singleton(String name) { this.name = name; }
    public static Singleton getInstance(String name) {
        if (single == null) {
            single = new Singleton(name);
        }
        return single;
    }
}
