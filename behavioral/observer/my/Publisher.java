package behavioral.observer.my;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Publisher {
    private Map<String, List<Listener>> map = new HashMap<>();

    public Publisher(String... eventType) {
        for (String eType : eventType) 
            map.put(eType, new ArrayList<>());
    }

    public void subsribe(String eventType, Listener listener) {
        map.get(eventType).add(listener);
    }

    public void unsubsribe(String eventType, Listener listener) {
        map.get(eventType).remove(listener);
    }

    public void notify(String eventType, String msg) {
        map.get(eventType).stream().forEach(e -> e.update(eventType, msg));
    }
}
