package structural.decorator.my.htmldemo;

import structural.decorator.my.htmldemo.decorators.SpanDecorator;
import structural.decorator.my.htmldemo.decorators.UnderlineDecorator;
import structural.decorator.my.htmldemo.htmlnodes.HtmlNode;
import structural.decorator.my.htmldemo.htmlnodes.TextNode;

public class Main {
    public static void main(String[] args) {
        // 基础对象
        HtmlNode textNode =
        new SpanDecorator(  // 第二次包装
            new UnderlineDecorator(  // 第一次包装
                new TextNode("text"))); // 基本对象
        System.out.println(textNode.getText());
        
        
        // 修改 text 
        textNode.setText("基本对象");
        System.out.println(textNode.getText());
    }
}
