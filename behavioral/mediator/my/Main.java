package behavioral.mediator.my;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Controller();

        Component barComponent = new BarComponent();
        Component fooComponent = new FooComponent();

        mediator.registerComponent(barComponent);
        mediator.registerComponent(fooComponent);

        mediator.sayHello();
    }
}
