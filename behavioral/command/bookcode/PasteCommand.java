package behavioral.command.bookcode;

// 粘贴命令

public class PasteCommand extends Command{
    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty())
            return false;
        
        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }

}
