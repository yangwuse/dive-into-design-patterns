package behavioral.command.bookcode.commands;

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
        editor.textField.insert(editor.clipboard, editor.textField.getInsertPosition());
        return true;
    }

}
