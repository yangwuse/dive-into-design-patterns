package behavioral.observer.my;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher("open", "close");
        publisher.subsribe("open", new OpenListener());
        publisher.subsribe("open", new OpenListener());
        publisher.subsribe("open", new OpenListener());
        publisher.subsribe("close", new CloseListener());   
        publisher.subsribe("close", new CloseListener());   
        publisher.subsribe("close", new CloseListener());   
        
        publisher.notify("open", "open a file");
        publisher.notify("close", "close a file");
    }
}
