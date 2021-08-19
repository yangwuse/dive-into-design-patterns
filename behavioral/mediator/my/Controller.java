package behavioral.mediator.my;

public class Controller implements Mediator {
    private BarComponent barComponent;
    private FooComponent fooComponent;

    @Override
    public void registerComponent(Component component) {
        component.setMediator(this);
        String name = component.getName();
        switch(name) {
            case "BarComponent":
                barComponent = (BarComponent) component;
                break;
            case "FooComponent":
                fooComponent = (FooComponent) component;
                break;
            default:
                System.out.println("Undifined component!!!");
        }
    }

    @Override
    public void sayHello() {
        barComponent.sayHello(fooComponent.getName());
        fooComponent.sayHello(barComponent.getName());
    }
    
}
