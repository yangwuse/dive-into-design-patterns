package structural.proxy.my;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("hello.jpg");
        image.display();
    }
}
