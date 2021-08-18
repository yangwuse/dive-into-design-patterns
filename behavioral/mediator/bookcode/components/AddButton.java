package behavioral.mediator.bookcode.components;

import javax.swing.JButton;
import java.awt.event.ActionEvent;

import behavioral.mediator.bookcode.mediator.Mediator;
import behavioral.mediator.bookcode.mediator.Note;

public class AddButton extends JButton implements Component {
    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void fireActionPerformed(ActionEvent actionEven) {
        mediator.addNewNote(new Note());
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;        
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}
