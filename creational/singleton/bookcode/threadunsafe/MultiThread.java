package creational.singleton.bookcode.threadunsafe;

public class MultiThread {
    public static void main(String[] args) {
        // Foo
       new Thread(()->{
           System.out.println(Singleton.getInstance("Foo").name);
       }).start();
       // Bar
       new Thread(()->{
           System.out.println(Singleton.getInstance("Bar").name);
       }).start();
    }
}
