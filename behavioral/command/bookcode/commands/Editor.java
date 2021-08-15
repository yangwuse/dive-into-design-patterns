package behavioral.command.bookcode.commands;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

// 编辑器
// 窗口( 面板( 文本框 ) )

public class Editor {
    public JTextArea textField;
    public String clipboard;
    private CommandHistory history = new CommandHistory();

    public void init() {
        // 顶层窗口 设置标题
        JFrame frame = new JFrame("Text editor (type & use buttons)!");
        // 内容面板(容器)
        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        textField = new JTextArea();
        // 超过宽度自动换行
        textField.setLineWrap(true);
        content.add(textField);
        // 按钮面板 居中对齐
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton ctrlC = new JButton("Ctrl+C");
        JButton ctrlX = new JButton("Ctrl+X");
        JButton ctrlV = new JButton("Ctrl+V");
        JButton ctrlZ = new JButton("Ctrl+Z");
        Editor editor = this;
        // 设置按钮事件监听器
        ctrlC.addActionListener(e -> executeCommand(new CopyCommand(editor)));
        ctrlV.setActio
    }

    public void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

}
