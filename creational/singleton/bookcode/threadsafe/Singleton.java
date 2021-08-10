package creational.singleton.bookcode.threadsafe;

public final class Singleton {
    public String name;
    // volatile 保证可见性
    private static volatile Singleton singleton;
    private Singleton(String name) { this.name = name; }
    public static Singleton getInstance(String name) {
        if (singleton == null) {
            synchronized(Singleton.class) {
                if (singleton == null)
                    singleton = new Singleton(name);
            }
        }
        return singleton;
    }
}
