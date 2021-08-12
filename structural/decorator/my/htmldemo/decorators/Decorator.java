package structural.decorator.my.htmldemo.decorators;

import structural.decorator.my.htmldemo.htmlnodes.HtmlNode;

// 祖先包装器

public class Decorator extends HtmlNode{
    // 引用 HtmlNode 对象
    protected HtmlNode htmlNode;
    public Decorator(HtmlNode node) { htmlNode = node; }

    @Override
    public String getText() {
        return htmlNode.getText();
    }
    @Override 
    public void setText(String text) {
        htmlNode.setText(text);
    }
}
