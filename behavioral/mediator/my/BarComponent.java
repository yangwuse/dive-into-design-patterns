package behavioral.mediator.my;

public class BarComponent implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "BarComponent";
    }

    @Override
    public void sayHello(String sb) {
        System.out.println("Hello " + sb + ", I'm " + getName());        
    }
    
}
