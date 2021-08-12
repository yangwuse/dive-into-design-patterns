package structural.decorator.bookcode;

public class FileDataSource implements DataSource{
    private String name;
    public FileDataSource(String name) {
        this.name = name;
    }
    @Override
    public void writeData(String data) {
        System.out.println("writeData " + data);
    }
    @Override
    public String readData() {
        return "readData";
    }

}
