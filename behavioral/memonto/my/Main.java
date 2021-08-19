package behavioral.memonto.my;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("state1");
        originator.setState("state2");

        CareTaker careTaker = new CareTaker();
        careTaker.add(originator.saveStateToMemento());

        originator.setState("state3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("state4");

        System.out.println("Current state: " + originator.getState());
        System.out.println("Restore state: " + careTaker.get(1).getState());
        System.out.println("Restore state: " + careTaker.get(0).getState());
    }
}
