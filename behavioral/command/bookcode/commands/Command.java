package behavioral.command.bookcode.commands;

// 命令接口
// 实现命令撤销

public abstract class Command {
    // 持有请求接受对象的引用
    protected Editor editor;
    // 备份状态
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    // 获取执行前编辑器文本：getter
    void backup() {
        backup = editor.textField.getText();
    }

    // 重置编辑器文本：setter
    public void undo() {
        editor.textField.setText(backup);
    }

    // 具体命令负责实现各自的执行方法
    public abstract boolean execute();
}
