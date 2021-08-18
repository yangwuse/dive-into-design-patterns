package behavioral.mediator.bookcode.components;

import javax.swing.JButton;
import java.awt.event.ActionEvent;

import behavioral.mediator.bookcode.mediator.Mediator;

public class SaveButton extends JButton implements Component {
    private Mediator mediator;

    public SaveButton() {
        super("Save");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;       
    }

    @Override
    public void fireActionPerformed(ActionEvent actionEvent) {
        mediator.saveChanges();
    }

    @Override
    public String getName() {
        return "SaveButton";
    }
    
}
