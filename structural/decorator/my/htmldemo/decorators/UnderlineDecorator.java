package structural.decorator.my.htmldemo.decorators;

import structural.decorator.my.htmldemo.htmlnodes.HtmlNode;

// 附加 <underline> 标签

public class UnderlineDecorator extends Decorator{
    public UnderlineDecorator(HtmlNode node) {
        super(node);
    }
    @Override
    public String getText() {
        return "<underline>" + super.getText() + "</underline>";
    }  
}
