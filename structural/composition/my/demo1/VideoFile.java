package structural.composition.my.demo1;

public class VideoFile extends File{
    public VideoFile(String name) {
        super(name);
    }
    @Override
    void display() {
        System.out.println("视频文件: " + name);
    }
}
