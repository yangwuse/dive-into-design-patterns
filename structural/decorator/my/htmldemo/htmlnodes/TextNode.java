package structural.decorator.my.htmldemo.htmlnodes;

public class TextNode extends HtmlNode{
    public TextNode(String text) {
        super(text);
    }
    @Override
    public String getText() {
        return text;
    }
}
