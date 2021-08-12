package structural.decorator.bookcode;

public class CompressDecorator extends Decorator{

    CompressDecorator(DataSource ds) {
        super(ds);
    }

    @Override
    public void writeData(String data) {
        System.out.println("Before writing data, first compressing data");
        super.writeData(data);
    }
    
}
