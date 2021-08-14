package structural.proxy.my;

public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // 延迟初始化
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }    
        // 预处理
        System.out.println("Loading image");
        realImage.display();
        // 后处理
        System.out.println("Close image");
    }
    
}
