package behavioral.observer.bookcode.listeners;

import java.io.File;

public class EmailNotifacationListener implements EventListener {
    private String email;

    public EmailNotifacationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String evenType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + 
            evenType + " operation with the following file: " + file.getName());
    }
    
}
