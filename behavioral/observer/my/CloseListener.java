package behavioral.observer.my;

public class CloseListener implements Listener {
    private static int id;
    private final int count = id++;

    @Override
    public void update(String eventType, String msg) {
        System.out.println("CloseListener #" + count + " " + eventType 
            + " happend, " + msg);        
    }
}
