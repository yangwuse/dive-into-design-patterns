package creational.singleton.bookcode.threadsafe;

public class MultiThread {
    public static void main(String[] args) {
        // Foo
        new Thread(()->{
        System.out.println(Singleton.getInstance("Foo").name);
        }).start();
        // Foo
        new Thread(()->{
            System.out.println(Singleton.getInstance("Bar").name);
        }).start();
    }
}
