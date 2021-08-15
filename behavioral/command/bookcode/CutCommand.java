package behavioral.command.bookcode;

// 具体的命令 负责操作逻辑
// 文本剪切 删除选中文本

public class CutCommand extends Command{
    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        // 没有选中文本
        if (editor.textField.getSelectedText().isEmpty()) 
            return false;
        
        backup();
        String source = editor.textField.getText();
        editor.clipboard = editor.textField.getSelectedText();
        editor.textField.setText(cutString(source));
        return true;
    }

    // 删除中间选中文本 拼接两端文本
    private String cutString(String source) {
        String start = source.substring(0, editor.textField.getSelectionStart());
        String end = source.substring(editor.textField.getSelectionEnd());
        return start + end;
    }
}
