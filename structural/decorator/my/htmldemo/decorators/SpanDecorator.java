package structural.decorator.my.htmldemo.decorators;

import structural.decorator.my.htmldemo.htmlnodes.HtmlNode;

// 附加 <span> 标签

public class SpanDecorator extends Decorator{
    public SpanDecorator(HtmlNode node) {
        super(node);
    }
    @Override
    public String getText() {
        return "<span>" + super.getText() + "</span>";
    }
}
