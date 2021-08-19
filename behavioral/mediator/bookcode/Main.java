package behavioral.mediator.bookcode;

import javax.swing.DefaultListModel;

import behavioral.mediator.bookcode.components.AddButton;
import behavioral.mediator.bookcode.components.DeleteButton;
import behavioral.mediator.bookcode.components.Filter;
import behavioral.mediator.bookcode.components.List;
import behavioral.mediator.bookcode.components.SaveButton;
import behavioral.mediator.bookcode.components.TextBox;
import behavioral.mediator.bookcode.components.Title;
import behavioral.mediator.bookcode.mediator.Editor;
import behavioral.mediator.bookcode.mediator.Mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel<>()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
