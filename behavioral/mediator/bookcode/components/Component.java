package behavioral.mediator.bookcode.components;

import behavioral.mediator.bookcode.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
