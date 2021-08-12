package structural.decorator.bookcode;

public class EncryptionDecorator extends Decorator{

    EncryptionDecorator(DataSource ds) {
        super(ds);
    }

    @Override
    public void writeData(String data) {
        System.out.println("Before writing data, first encrypting data");
        super.writeData(data);
    }
    
}
