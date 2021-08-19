package behavioral.observer.bookcode.publisher;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import behavioral.observer.bookcode.listeners.*;

public class EventManager {
    // eventType : eventTypeListeners
    private Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            listeners.put(operation, new ArrayList<>());
        }
    }

    public void subsribe(String eventType, EventListener listener) {
        listeners.get(eventType).add(listener);
    }

    public void unsubsribe(String eventType, EventListener listener) {
        listeners.get(eventType).remove(listener);
    }

    public void notify(String eventType, File file) {
        listeners.get(eventType).stream()
            .forEach(e -> e.update(eventType, file));
    }
}
