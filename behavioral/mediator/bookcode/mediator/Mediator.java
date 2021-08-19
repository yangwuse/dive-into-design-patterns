package behavioral.mediator.bookcode.mediator;

import javax.swing.ListModel;

import behavioral.mediator.bookcode.components.Component;

// 中介接口
// 包含组件间相互交流的方法

public interface Mediator {
    // 注册各种 GUI 组件
    void registerComponent(Component component);

    // 各种组件通信方法
    void addNewNote(Note note);
    void deleteNote();
    void getInfoFromList(Note note);
    void saveChanges();
    void markNote();
    void clear();
    void sendToFilter(ListModel listModel);
    void setElementsList(ListModel list);
    void hideElements(boolean flag);
    void createGUI();
}
