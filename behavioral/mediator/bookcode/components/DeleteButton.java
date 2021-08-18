package behavioral.mediator.bookcode.components;

import javax.swing.JButton;
import java.awt.event.ActionEvent;

import behavioral.mediator.bookcode.mediator.Mediator;

public class DeleteButton extends JButton implements Component {
    private Mediator mediator;

    public DeleteButton() {
        super("Del");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void fireActionPerformed(ActionEvent actionEvent) {
        mediator.deleteNote();
    }

    @Override
    public String getName() {
        return "DelButton";
    }
    
}
