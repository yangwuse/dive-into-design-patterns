package structural.composition.my.filedemo;

import java.util.ArrayList;
import java.util.List;

// 容器节点: 文件夹文件
// 包含对元素节点处理的特有方法

public class FlodFile extends File{
    private List<File> children;
    private int level;
    public FlodFile(String name, int l) {
        super(name);
        children = new ArrayList<>();
        level = l;
    }
    @Override
    void display() {
        System.out.println("文件夹文件: " + name);
        
        for (File f : children) {
            for (int i = 0; i < level; i++)
                System.out.print("    ");
            f.display();       
        } 
    }
    public FlodFile add(File f) {
        children.add(f);
        return this;
    }
    public void delete(File f) {
        children.remove(f);
    }
    
}
