package structural.decorator.my.htmldemo.htmlnodes;

// 统一节点接口

public abstract class HtmlNode {
    protected String text;
    protected HtmlNode() {}
    protected HtmlNode(String s) { text = s; }
    public void setText(String text) {
        this.text = text;
    }
    // 获取 Text
    public abstract String getText();
}
