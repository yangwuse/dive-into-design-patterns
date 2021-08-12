package structural.decorator.bookcode;

public class Main {
    public static void main(String[] args) {
        DataSource ds = new FileDataSource("hello world");
        // 写之前 加密 压缩
        ds = new CompressDecorator(new EncryptionDecorator(ds));
        ds.writeData("12345678abcdefg");
    }
}
