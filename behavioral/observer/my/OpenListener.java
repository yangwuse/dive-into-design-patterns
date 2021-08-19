package behavioral.observer.my;

public class OpenListener implements Listener {
    private static int id;
    private final int count = id++;

    @Override
    public void update(String eventType, String msg) {
        System.out.println("OpenListener#" + count + " " + eventType 
            + " happend, " + msg);
    }
}
