package behavioral.observer.bookcode;

import behavioral.observer.bookcode.editor.Editor;
import behavioral.observer.bookcode.listeners.EmailNotifacationListener;
import behavioral.observer.bookcode.listeners.LogOpenListener;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subsribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subsribe("save", new EmailNotifacationListener("123@1123"));

        try {
            editor.openFile("text.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
