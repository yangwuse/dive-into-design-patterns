package structural.proxy.my;

public class RealImage implements Image{
    private String fileName;
    public RealImage(String name) { fileName = name; }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);    
    }
    
}
