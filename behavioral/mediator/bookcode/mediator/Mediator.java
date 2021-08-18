package behavioral.mediator.bookcode.mediator;

import javax.swing.ListModel;

import behavioral.mediator.bookcode.components.Component;

// 中介接口
// 包含组件间相互交流的方法

public interface Mediator {
    void addNewNote(Note note);
    void deleteNote();
    void getInfoFromList(Note note);
    void saveChanges();
    void markNote();
    void clear();
    void sendToFilter(ListModel listModel);
    void setElementsList(ListModel list);
    void registerComponent(Component component);
    void hideElements(boolean flag);
    void createGUI();
}
