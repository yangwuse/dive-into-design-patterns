package behavioral.observer.bookcode.listeners;

import java.io.File;

public interface EventListener {
    void update(String evenType, File file);
}
