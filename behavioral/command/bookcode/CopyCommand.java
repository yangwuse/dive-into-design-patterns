package behavioral.command.bookcode;

// 复制命令

public class CopyCommand extends Command{
    public CopyCommand(Editor editor) {
        super(editor);
    }    

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }

}
