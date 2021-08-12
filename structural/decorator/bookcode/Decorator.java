package structural.decorator.bookcode;


public class Decorator implements DataSource{
    private DataSource wrappee;
    Decorator(DataSource ds) { wrappee = ds; }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
       return wrappee.readData();
    }
    
}
