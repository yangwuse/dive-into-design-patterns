package behavioral.mediator.bookcode.components;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import behavioral.mediator.bookcode.mediator.Mediator;
import behavioral.mediator.bookcode.mediator.Note;

public class List extends JList implements Component{
    private Mediator mediator;
    private final DefaultListModel LIST_MODEL;

    public List(DefaultListModel listModel) {
        super(listModel);
        LIST_MODEL = listModel;
        setModel(listModel);
        setLayoutOrientation(JList.VERTICAL);
        Thread thread = new Thread(new Hide(this));
        thread.start();
    }

    private class Hide implements Runnable {
        private List list;

        Hide(List list) {
            this.list = list;
        }

        @Override
        public void run() {
            while(true) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (list.isSelectionEmpty())
                    mediator.hideElements(true);
                else 
                    mediator.hideElements(false);
            }
        }
    }

    @Override
    public void setMediator(Mediator mediator) {
        mediator = mediator;
    }

    public void addElement(Note note) {
        LIST_MODEL.addElement(note);
        int index = LIST_MODEL.size() - 1;
        setSelectedIndex(index);
        ensureIndexIsVisible(index);
        mediator.sendToFilter(LIST_MODEL);
    }

    public void deleteElement() {
        int index = getSelectedIndex();
        try {
            LIST_MODEL.remove(index);
            mediator.sendToFilter(LIST_MODEL);
        } catch(ArrayIndexOutOfBoundsException ignored) {}
    }

    public Note getCurrentElement() {
        return (Note)getSelectedValue();
    }

    @Override
    public String getName() {
        return "List";
    }
    
}
