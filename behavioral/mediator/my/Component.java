package behavioral.mediator.my;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
    void sayHello(String sb);
}
