package structural.composition.my.demo1;

// 元素对象

public class ImageFile extends File{
    public ImageFile(String name) {
        super(name);
    }
    @Override
    void display() {
        System.out.println("图片文件: " + name);        
    }
    
}
