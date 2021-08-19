package behavioral.observer.bookcode.listeners;

import java.io.File;

public class LogOpenListener implements EventListener {
    private File log;

    public LogOpenListener(String fileName) {
        log = new File(fileName);
    }

    @Override
    public void update(String evenType, File file) {
        System.out.println("Save to log " + log + ": Someone has preformed " +
            evenType + " operation with the following file: " + file.getName());
    }
    
}
