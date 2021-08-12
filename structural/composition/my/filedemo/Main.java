package structural.composition.my.filedemo;

// 安全组合模式
// 不能统一元素对象和容器对象
// 分开使用 FlodFile 和 File 
public class Main {
    public static void main(String[] args) {
        // 根文件夹包含: a.jgp b.avi c
        FlodFile root = new FlodFile("根文件夹 root", 1);
        File image = new ImageFile("a.jpg");
        File video = new VideoFile("b.avi");
        FlodFile subFlod = new FlodFile("c", 2); 
        root.add(image).add(video).add(subFlod);
        
        // 子文件夹c包含: d.png e.mp4
        File image2 = new ImageFile("d.png");
        File video2 = new VideoFile("e.mp4");
        subFlod.add(image2).add(video2);
        
        // 打印整个个文件树
        root.display();

    }
}
