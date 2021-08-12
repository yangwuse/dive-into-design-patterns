package structural.decorator.bookcode;

public interface DataSource {
    void writeData(String data);
    String readData();
}
